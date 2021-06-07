//declaring the package name
package ncu.processors;

import java.io.*;
import java.util.*;

public class Productivity_Calc {

    //declaring variables used in the function for calculation
    public static float total = 0;
    public static float prod = 0;
    public static float percent =0;

    //declaring a scanner variable
    public static Scanner x;

    //function to open the .txt file of that user and calculate the total time of the task
    public static void Totaltime(String username){

        //creating path of the user's file
        String path = String.format("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/"+username+"_Productivitycalc.txt");

        try{

            x = new Scanner(new File(path));

            //setting conditions to read the content untill it reaches the end of the file
            while(x.hasNext()){

                String a = x.next();
                String b = x.next();
                String c = x.next();
                float d = x.nextFloat();
                String e = x.next();

                //adding the time to get the total time
                total += d;
            }

        }catch (Exception e){

        }

        //printing the total time
        System.out.println("                                                          |           ---> TOTAL TIME SPENT... = "+total+" hrs");

    }


    //function to open the txt.file of that user and calculate only the productive time of the user
    public static void prod_time(String username){

        //creating the path of the user's file
        String path = String.format("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/"+username+"_Productivitycalc.txt");

        try{

            x = new Scanner(new File(path));

            //setting conditions to read the content untill it reaches the end of the file
            while(x.hasNext()){

                String a = x.next();
                String b = x.next();
                String c = x.next();
                float d = x.nextFloat();
                String e = x.next();

                //calculating the sum of productive task's time only.
                if(a.equals("category:productive")){
                    prod += d;
                }else{

                }
            }
        }catch (Exception f){

        }
    }


    //function to display the productive hours and productivity of the user
    public static void calculate(){

        //initialising a variable for the productivity percent
        percent = (prod*100/total);


        if(percent > 50.0) {
            System.out.println("                                                          |           ---> YOUR PRODUCTIVE HOURS... = " + (prod) + "hrs");
            System.out.println("                                                          |           ");
            System.out.println("                                                          |           ---> PRODUCTIVITY PERECENT = "+percent+" :) ");
            prod = total = percent = 0;
        }

        else {
            System.out.println("                                                          |           ---> YOUR PRODUCTIVE HOURS... = " + (prod) + "hrs");
            System.out.println("                                                          |           ");
            System.out.println("                                                          |           ---> PRODUCTIVITY PERECENT = "+percent+" :( ");
            prod = total = percent = 0;
        }

    }


}


