package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import  io.cucumber.java.en.Given;
import  io.cucumber.java.en.Then;
import  io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import starter.models.*;
import starter.questions.CheckNewBusinessUnitWasAdded;
import starter.tasks.AddInformationForBusinessUnit;
import starter.tasks.InformationForNewMeeting;
import starter.tasks.Login;
import starter.tasks.NavigateTo;
import starter.util.GetInfoFromTable;



public class AddBusinessUnitStepDefinitions {

    @Given("{actor} is logged into the application")
    public void isLoggedIntoTheApplication(Actor actor , DataTable userLogin ){
        LoginModel loginModel = GetInfoFromTable.getLoginCredentials(userLogin);

        actor.attemptsTo(
               NavigateTo.loginPage(),
                new Login(loginModel.getUsername(), loginModel.getPaswword())
        );
    }

    @When("{actor} enters the required information for the new business Unit")
    public void entersTheRequiredInformationForTheNewBusinessUnit(Actor actor , DataTable businessUnitInfo){
        BusinessUnitModel businessUnitModel = GetInfoFromTable.getTransactionData(businessUnitInfo);
        actor.attemptsTo(
                new AddInformationForBusinessUnit(businessUnitModel.getNameUnit() , businessUnitModel.getFatherUnit())
        );
    }

    @Then("{actor} should see a new Unit in the Unit list")
    public void shouldSeeANewUnitInTheUnitList(Actor actor , DataTable informationReviewed){
        DataVerifiedModel dataVerifiedModel = GetInfoFromTable.getDataVerified(informationReviewed);
        actor.attemptsTo(
                new CheckNewBusinessUnitWasAdded(dataVerifiedModel.getBusinessUnitVerified())
        );
    }

    @And("{actor} should be able to create a meeting with the created unit")
    public void shouldBeAbleToCreateAMeetingWithTheCreatedUnit(Actor actor , DataTable meetingInformation){
        MeetingCreatedModel meetingCreatedModel = GetInfoFromTable.getMeetingCreated(meetingInformation);
        DataMeetingCreatedModel dataMeetingCreatedModel = GetInfoFromTable.getDataMeetingCreated(meetingInformation)
      //  DataMeetingCreatedModel dataMeetingCreatedModel= GetInfoFromTable.getMeetingCreated(meetingInformation));
        actor.attemptsTo(
               new InformationForNewMeeting(meetingCreatedModel.getMeetingName(),meetingCreatedModel.getMeetingNumber())
         //      new MeetingCreatedModel(meetingCreatedModel.getMeetingName(meetingInformation))

             //  new CheckNewBusinessUnitWasAdded(dataVerifiedModel.getBusinessUnitVerified())
        );
      }

}

