//declaring the package name
package ncu.validators;

import ncu.exceptions.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.util.*;

public class usernamevalidators{

        // declaring references and variables
         public static Pattern pattern;
         public static Matcher matcher;
         public static int exist = 0;
         public static int scan = 0;


        // method to display the valid input user can enter
        public static void validationDispaly() {

        System.out.println("                                                           ======================================================================================= ");
        System.out.println("                                                              ---> choose a username between 3 to 15 characters.           ");
        System.out.println("                                                              ---> Makesure it does not contain any special character.");
        System.out.println("                                                              ---> Note : You can use  ' _ ' and ' - ' in your username.");
        System.out.println("                                                           ======================================================================================= ");
        for(int i =0; i < 20; i++){
            System.out.println("");
        }

        }


        // creating a pattern to be compared with{
        private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";


        // method to compare the passed string with the pattern created
        public static boolean validate(String username) {

        //assigning value to the reference
        pattern = Pattern.compile(USERNAME_PATTERN);

        //matching the string with the pattern
        matcher = pattern.matcher(username);

        //return true if it matches
        return matcher.matches();

         }


        // method to check wher passed string already exists in the file
        public static void allReadyUsername(String username) {


        try {

            // opening the userdetail file where the usernames are saved
            Scanner x = new Scanner(new File("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/details.txt"));
            x.useDelimiter("[.\n]");

            // setting condition to read the file untill it reaches the end
            while (x.hasNext()) {

                String tempUsername = x.next();

                //if it exits setting conditions
                if (tempUsername.trim().equals(username.trim())) {
                    exist = 1;
                }
            }

            //closing the resources
            x.close();

        } catch (Exception e) {
            e.printStackTrace();
        }}


        //method to scan the username in user detail file
        public static void scanDetails(String username){
         String path = String.format("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/" + username + "_Productivitycalc.txt");
         try {
             Scanner x = new Scanner(new File("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/details.txt"));
             x.useDelimiter("[.\n]");

             while (x.hasNext()) {
                 String tempUsername = x.next();

                 if (tempUsername.trim().equals(username.trim())) {
                     scan += 1;
                 } else {

                 }
             }

             x.close();
         }catch (Exception e){

         }
     }


        //method  throwing exception for the Username not found
        public static void NotFound(String username) throws UsernameNotFound {

        if(scan > 0) {

        } else {
            throw new UsernameNotFound(" Username does not exist.");
        }

     }



}


