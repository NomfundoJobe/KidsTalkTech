package org.example;

public class NewLogger {
        private String Name ;
        private String Surname;
        private int  Id_Number ;
        private String Guardian_Name;
        private int Guardian_Contact_Details;
        private String Home_Address;
        boolean yes ;
//        boolean isIdValidIdNumber;
        
//        private String Introduction;

        public NewLogger(String Name, String Surname, String Id_Number, String Guardian_Name,
                         String Guardian_Contact_Details , String Home_Address , String Introduction) {
            this.Name = Name;
            this.Surname = Surname;
            this.Id_Number = Integer.parseInt(Id_Number);
            this.Guardian_Name = Guardian_Name;
            this.Guardian_Contact_Details = Integer.parseInt(Guardian_Contact_Details);
            this.Home_Address = Home_Address;
//            this.Introduction = Introduction;
        }

//    public String getIntroduction() {
//        return Introduction;
//    }
//
//    public void setIntroduction(String introduction) {
//        Introduction = introduction;
//    }

    public NewLogger() {

        }

        public String getName(String name) {

            return Name;
        }

        public void setName(String name) {
            this.Name = name;
        }
        public String getSurname() {

            return  Surname;
        }
        public void setSurname(String surname){

            this.Surname = surname;
        }
        public int getId_Number(){
            return Id_Number;
        }
        public void setId_Number(int id_number){
            this.Id_Number = Id_Number;
        }

        public String getGuardian_Name(){
            return Guardian_Name;
        }

    public void setGuardian_Name(String guardian_Name) {
        Guardian_Name = guardian_Name;
    }

    public int getGuardian_Contact_Details() {
        return Guardian_Contact_Details;
    }

    public void setGuardian_Contact_Details(int guardian_Contact_Details) {
        this.Guardian_Contact_Details = guardian_Contact_Details;
    }

    public String getYes(String yes){
            return yes;
    }

    public void setYes(String yes){
            this.yes = Boolean.parseBoolean(yes);
    }
//
//    public static boolean isIdValidIdNumber(String idNumber) {
//        // Check if the ID number is 13 characters long
//        if (idNumber.length() != 13) {
//            return false;
//        }
//
//        // Check if the ID number contains only digits
//        if (!idNumber.matches("[0-9]+")) {
//            return false;
//        }
//
//        // Calculate the checksum
//        int[] factors = { 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2 };
//        int checksum = 0;
//        for (int i = 0; i < factors.length; i++) {
//            int digit = Character.getNumericValue(idNumber.charAt(i));
//            int product = factors[i] * digit;
//            checksum += product > 9 ? product - 9 : product;
//        }
//
//        // Check if the checksum is valid
//        int lastDigit = Character.getNumericValue(idNumber.charAt(12));
//        int calculatedDigit = (10 - (checksum % 10)) % 10;
//        return lastDigit == calculatedDigit;
//    }
//
//    public boolean isIdValidIdNumber() {
//        return isIdValidIdNumber;
//    }
//
//    public String isValidIdNumber(String isValidIdnumber){
//            return
//    }

    //    public  boolean isIdValid(){
//            if((Id_Number == 0 || Id_Number.length() != 13)) {
//                return false;
//            }
//            int count = 0 ;
//            for(int eachCount = 0; eachCount<12 ; eachCount++){
//                int idNumbers = Character.getNumericValue(Id_Number.charAt(eachCount));
//                if(eachCount % 2 == 0){
//                    count += idNumbers;
//                } else {
//                    count += idNumbers *2 %10 + idNumbers*2 /10;
//                }
//            }
//            int CheckIdNumbers= (10 - count %10) %10;
//            return CheckIdNumbers == Character.getNumericValue(Id_Number.charAt(12));
//    }

}
