package ncu.processors;

import java.util.*;
import java.io.*;

public class login {

    // method to display login page
    public static void displayloginpage() {

        for(int i =0; i < 40; i++){
            System.out.println("");
        }
        System.out.println("                                                           --------------------------------------------------------------------------------------- ");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                          |                             _________________________                                 |");
        System.out.println("                                                          |                            | PRODUCTIVITY CALCULATOR |                                |");
        System.out.println("                                                          |                             -------------------------                                 |");
        System.out.println("                                                          |                                    LOGIN PAGE                                         |");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                           --------------------------------------------------------------------------------------- ");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                          |                             __________                                                |");
        System.out.println("                                                          |    Enter Username   ----   | Username |                                               |");
        System.out.println("                                                          |                             ----------                                                |");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                          |                             __________                                                |");
        System.out.println("                                                          |    Enter Password   ----   | Password |                                               |");
        System.out.println("                                                          |                             ----------                                                |");
        System.out.println("                                                          |                                                                                       |");
        System.out.println("                                                           --------------------------------------------------------------------------------------- ");
        for(int i =0; i < 20; i++){
            System.out.println("");
        }

    }


    // method to check that entered username and password is valid
    public static boolean check(String username, String password) {

        boolean b = true;

        try {

            // opening the user detail txt file where the user information is saved
            Scanner x = new Scanner(new File("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/details.txt"));

            // declaring references
            String tempUsername="";
            String tempPassword="";

            // setting condition to read the file untill it reaches the end
            while(x.hasNext() && !b)
            {
                // scanning
                tempUsername = x.next();
                tempPassword = x.next();

                // setting condition
                if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())){
                    return (b = true);
                }
                else {
                    return (b = false);
                }


            }

            // closing resources
            x.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
}