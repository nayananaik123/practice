package javainonevedio.Oops_concept;

import java.util.Scanner;

class CollegeWifi {
    public String wifiUserName;
    private String collegeWifiPassword;
    boolean connectedOrNot=false;

    public boolean  isConnectedOrNot(){
         return this.connectedOrNot;
        }

    public boolean checkPasswordIsCorrect(){
          System.out.println("Enter the password for Wifi");
          Scanner sc=new Scanner(System.in);
            for(int i=0;i<3;i++) {
                String password = sc.next();

                if (this.collegeWifiPassword != null && password.equals(this.collegeWifiPassword)) {
                    this.connectedOrNot = true;
                    return this.connectedOrNot;
                }
            }
            
    }

}
