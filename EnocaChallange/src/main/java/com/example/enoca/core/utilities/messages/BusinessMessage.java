package com.example.enoca.core.utilities.messages;

public class BusinessMessage {

    public static class GlobalMessages {

        public static final String DATA_LISTED_SUCCESSFULLY = "Data Listed Successfully";

        public static final String DATA_ADDED_SUCCESSFULLY = "Data Added Successfully";
        public static final String DATA_UPDATED_SUCCESSFULLY = "Data updated Successfully, dataId: ";
        public static final String DATA_DELETED_SUCCESSFULLY = "Data deleted successfully, dataId: ";
        public static final String DATA_EMPTY = "Data is Empty ";
    }

    public static class RoomMessage {

        public static final String ROOM_ID_NOT_FOUND = "Room Id Not Found roomId: ";

    }

    public static class BabyMessage {
        public static final String BABY_ID_NOT_FOUND = "Baby Id Not Found babyId: ";
    }

    public static class CompanyMessage {
        public static final String COMPANY_ID_NOT_FOUND = "Company Id Not Found companyId: ";
    }

    public static class ParentMessage {
        public static final String PARENT_ID_NOT_FOUND = "Parent Id Not Found parentId: ";
    }

}
