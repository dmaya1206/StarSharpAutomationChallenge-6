package starter.util;

import io.cucumber.datatable.DataTable;
import starter.models.*;

import java.util.List;

public class GetInfoFromTable {
    public static LoginModel getLoginCredentials(DataTable userLogin){

        List<List<String>> rows = userLogin.asLists(String.class);
        String username = "";
        String password = "";
        for (List<String> columns:rows) {
            username = columns.get(0);
            password = columns.get(1);

        }
        LoginModel loginmodel = new LoginModel();
        loginmodel.setUsername(username);
        loginmodel.setPaswword(password);
        return loginmodel;
    }
    public static BusinessUnitModel getTransactionData(DataTable transactionInfo){
        List<List<String>> rows = transactionInfo.asLists(String.class);
        String transactNameUnit = "";
        String transactDescription ="";
        for (List<String> columns:rows) {
            transactNameUnit = columns.get(0);
            transactDescription = columns.get(1);
        }
        BusinessUnitModel businessUnitModel = new BusinessUnitModel();
        businessUnitModel.setNameUnit(transactNameUnit);
        businessUnitModel.setFatherUnit(transactDescription);

        return businessUnitModel;
    }
    public static DataVerifiedModel getDataVerified(DataTable dataVerified){
        List<List<String>> rows = dataVerified.asLists(String.class);
        String businessUnitDate = "" ;
        for (List<String> columns:rows) {
            businessUnitDate = columns.get(0);
        }
        DataVerifiedModel dataVerifiedModel = new DataVerifiedModel();
        dataVerifiedModel.setBusinessUnitVerified(businessUnitDate);
        return dataVerifiedModel;
    }

      public static MeetingCreatedModel getMeetingCreated(DataTable meetingDateCreated){

        List<List<String>> rows = meetingDateCreated.asLists(String.class);
        String meetingName = "" ;
        String meetingNumber = "";
        for (List<String> columns:rows) {
            meetingName = columns.get(0);
            meetingNumber = columns.get(1);
        }
        MeetingCreatedModel meetingCreatedModel = new MeetingCreatedModel();
        meetingCreatedModel.setMeetingName(meetingName);
        meetingCreatedModel.setMeetingNumber(meetingNumber);

        return meetingCreatedModel;
    }

    public static DataMeetingCreatedModel getDataMeetingCreated(DataTable dataMeetingDateCreated){

        List<List<String>> rows = dataMeetingDateCreated.asLists(String.class);
        String meetingName = "" ;
        String meetingNumber = "";
        for (List<String> columns:rows) {
            meetingName = columns.get(0);
            meetingNumber = columns.get(1);
        }
        DataMeetingCreatedModel dataMeetingCreatedModel = new DataMeetingCreatedModel();
        dataMeetingCreatedModel.getMeetingName(meetingName);
        dataMeetingCreatedModel.getMeetingNumber(meetingNumber);

        return dataMeetingCreatedModel;
    }
}
