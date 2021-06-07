//declaring the package name
package ncu.processors;

import java.io.*;

public class createuser{

    // method to display the login page
    public static void displaypage(){

        for(int i =0; i < 40; i++){
            System.out.println("");
        }
        System.out.println("                                                           --------------------------------------------------------------------------------------- ");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                          |                             ________________________                                  |");
        System.out.println("                                                          |                            | PRODUCTIVITY CALCULATOR|                                 |");
        System.out.println("                                                          |                             ------------------------                                  |");
        System.out.println("                                                          |                                 New user Portal                                       |");
        System.out.println("                                                           --------------------------------------------------------------------------------------- ");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                          |                                __________                                             |");
        System.out.println("                                                          |    Enter  username       ---  | Username |                                            |");
        System.out.println("                                                          |                                ----------                                             |");
        System.out.println("                                                          |                                 ________                                              |");
        System.out.println("                                                          |    Set password          ---  | Password |                                            |");
        System.out.println("                                                          |                                 --------                                              |");
        System.out.println("                                                          |                                 ________________                                      |");
        System.out.println("                                                          |    Confirm password      ---  | confirm password |                                    |");
        System.out.println("                                                          |                                 ----------------                                      |");
        System.out.println("                                                           --------------------------------------------------------------------------------------- ");

    }


    // method to compare the entered password and confirmed password
    public static int confirm(String password, String cpassword) {

        // setting conditions
        if (password.contentEquals(cpassword)) {
            for (int i = 0; i < 40; i++) {
                                System.out.println("");
                            }
                            System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                             _________________________                                 |");
                            System.out.println("                                                          |                            | PRODUCTIVITY CALCULATOR |                                |");
                            System.out.println("                                                          |                             -------------------------                                 |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                        < PROFILE CREATED || LOGIN SUCCESSFUL... >                     |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                            for (int i = 0; i < 20; i++) {
                                System.out.println("");
                            }
                            timedelay.delay();
                            timedelay.delay();
            return 1;
        }
        else {
            for (int i = 0; i < 40; i++) {
                                System.out.println("");
                            }
                            System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                             _________________________                                 |");
                            System.out.println("                                                          |                            | PRODUCTIVITY CALCULATOR |                                |");
                            System.out.println("                                                          |                             -------------------------                                 |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |               < ENTERED PASSWORD DOES NOT MATCH THE CONFIRM PASSWORD >                |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                    < TRY AGAIN >                                      |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                          |                                                                                       |");
                            System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                            for (int i = 0; i < 20; i++) {
                                System.out.println("");
                            }
                            timedelay.delay();
                            timedelay.delay();
            return 0;
        }
    }


    // method to add new user data into the user detail file
    public static void adduser(String credentials,String username) {

        // opening the userdeatil file
        File detailmodified = new File("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/details.txt");

        // declaring references
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {

            // assigning references
            fw = new FileWriter(detailmodified,true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            // printing user's information in the user detail txt file
            pw.println(credentials);

            // also creating a new .txt file with the user's name to save the user's task list
            String path = String.format("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/"+username+"_Productivitycalc.txt");
            File user = new File(path);
            user.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {

                    //Closing the resources
                    pw.close();
                    bw.close();
                    fw.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
}

