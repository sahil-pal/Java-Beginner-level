//declaring the package name
package ncu.processors;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class delete
{
     //declaring a scanner variable
     public static Scanner x;

     //function to open the .txt file of that user and delete task.
     public static void deleteFile(String username, String original) {

         //creating a temporary file
         String tempFile = "/Users/sahilpal/Desktop/SAHIL/PROJECT/users/temp_Productivitycalc.txt";

         //creating path of user's file
         String path = String.format("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/"+username+"_Productivitycalc.txt");

         //passing both the path
         File oldFile = new File(path);
         File newFile = new File(tempFile);

         //declaring a variable to read string
         String content = "";

         try{

             FileWriter fw = new FileWriter(tempFile,true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw);

             x = new Scanner(new File(path));

             //to scan a single line; using delimiter
             x.useDelimiter("[\n]");

             // setting condition
             while(x.hasNext()){

                 //passing file's string in the content variable
                 content = x.next();

                 //comparing it with the string to be deleted
                 if(content.equals(original)){

                 }
                 else
                 {
                     //if string does not matches the string to be deleted
                     //it will be printed in the new temporary file created
                     pw.println(content);
                 }
             }

             //closing resources
             x.close();
             pw.flush();
             pw.close();

             //deleting the old user file
             oldFile.delete();

             //renaming the temp file with the name of user's file
             newFile.renameTo(oldFile);


         }catch(Exception e){
             JOptionPane.showMessageDialog(null,"error");
         }

    }


}

