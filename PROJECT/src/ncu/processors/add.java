//declaring the package name
package ncu.processors;

import java.io.*;
import java.util.*;


public class add{

    //function to open the .txt file of that user and add task.
    public static void save(String username,String category,String task_name,float time){

        //creating path of user's file
        String path = String.format("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/"+username+"_Productivitycalc.txt");

        //passing the file's path
        File fileToBeModified = new File(path);
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {

            fw = new FileWriter(path,true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            //printing the task in file
            pw.println("category:"+category+"                Task_name:"+task_name+"               Time_spent: "+time+" hrs");



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


