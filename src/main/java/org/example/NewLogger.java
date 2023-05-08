package org.example;

import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

public class NewLogger {
        private String Name ;
        private String Surname;
        private int  Id_Number ;
        private String Guardian_Name;
        private int Guardian_Contact_Details;
        private String Home_Address;

        public NewLogger(String Name, String Surname, String Id_Number, String Guardian_Name,
                         String Guardian_Contact_Details , String Home_Address) {
            this.Name = Name;
            this.Surname = Surname;
            this.Id_Number = Integer.parseInt(Id_Number);
            this.Guardian_Name = Guardian_Name;
            this.Guardian_Contact_Details = Integer.parseInt(Guardian_Contact_Details);
            this.Home_Address = Home_Address;
        }

        public NewLogger() {

        }

        public String getName() {
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
        public void setId_Number(String id_number){
            this.Id_Number = Integer.parseInt(id_number);
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
        Guardian_Contact_Details = guardian_Contact_Details;
    }




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
