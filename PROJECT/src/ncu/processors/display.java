//declaring the package name
package ncu.processors;

import java.io.*;
import java.util.*;

public class display{

    //declaring a scanner variable
    public static Scanner x;

    //function to open the .txt file of that user and display the task list
    public static void displaytask(String username){

        //creating path of user's file
        String path = String.format("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/"+username+"_Productivitycalc.txt");

        try{

            x = new Scanner(new File(path));

            //setting condition to read the file till it reaches the end
            while(x.hasNext()) {

                //declaring variable according to the format the information is saved
                String a = x.next();
                String b = x.next();
                String c = x.next();
                float d = x.nextFloat();
                String e = x.next();

                // for displaying all task in 1st column in allignment we are adding conditions
                if (a.equals("category:productive")) {
                    // for allignment between 2nd and 3rd column
                    if(b.length() == 15) {
                        System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                        System.out.println("                                                          |");
                        System.out.printf("                                                          | ~ %s                %s              %s %s %s      %n", a, b, c, d, e);
                        System.out.println("                                                          |");
                    }
                    else if(b.length() == 16) {
                        System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                        System.out.println("                                                          |");
                        System.out.printf("                                                          | ~ %s                %s             %s %s %s %n", a, b, c, d, e);
                        System.out.println("                                                          |");
                    }
                    else if(b.length() == 17) {
                        System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                        System.out.println("                                                          |");
                        System.out.printf("                                                          | ~ %s                %s            %s %s %s %n", a, b, c, d, e);
                        System.out.println("                                                          |");
                    }
                }

                // decreasing the gap between 1st string and 2nd string as word non-productive is bigger than the word productive
                else if (a.equals("category:non-productive")){
                    // for allignment between 2nd and 3rd column
                    if(b.length() == 15) {
                        System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                        System.out.println("                                                          |");
                        System.out.printf("                                                          | ~ %s            %s              %s %s %s %n", a, b, c, d, e);
                        System.out.println("                                                          |");
                    }
                    else if(b.length() == 16) {
                        System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                        System.out.println("                                                          |");
                        System.out.printf("                                                          | ~ %s            %s             %s %s %s %n", a, b, c, d, e);
                        System.out.println("                                                          |");
                    }
                    else if(b.length() == 17) {
                        System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                        System.out.println("                                                          |");
                        System.out.printf("                                                          | ~ %s            %s            %s %s %s %n", a, b, c, d, e);
                        System.out.println("                                                          |");
                    }
                }

                // managing again the gap between 1st and 2nd string
                else if(a.equals("category:essential")){
                    // for allignment between 2nd and 3rd column
                     if(b.length() == 15) {
                        System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                        System.out.println("                                                          |");
                        System.out.printf("                                                          | ~ %s                 %s              %s %s %s %n", a, b, c, d, e);
                        System.out.println("                                                          |");
                    }
                    else if(b.length() == 16) {
                        System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                        System.out.println("                                                          |");
                        System.out.printf("                                                          | ~ %s                 %s             %s %s %s %n", a, b, c, d, e);
                        System.out.println("                                                          |");
                    }
                    else if(b.length() == 17) {
                        System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                        System.out.println("                                                          |");
                        System.out.printf("                                                          | ~ %s                 %s            %s %s %s %n", a, b, c, d, e);
                        System.out.println("                                                          |");
                    }
                }
            }
        }catch (Exception e){

        }
    }


}