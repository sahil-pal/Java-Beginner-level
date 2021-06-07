//declaring the package name
package ncu.processors;

import java.io.*;

public class update {

    //function to open the .txt file of that user and update task.
    public static void UpdateFile(String username, String original, String newtask) {

         //creating path of user's file
         String path = String.format("/Users/sahilpal/Desktop/SAHIL/PROJECT/users/"+username+"_Productivitycalc.txt");

         //passing the file's path
         File fileToBeModified = new File(path);
         String oldContent = "";
         BufferedReader reader = null;
         FileWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            String line = reader.readLine();

            //setting the condition to read the file untill it reaches the end
            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }

            //Replacing oldString with newString in the oldContent
            String newContent = oldContent.replaceAll(original, newtask);

            //Rewriting the input text file with newContent
            writer = new FileWriter(fileToBeModified);

            //writing the new content
            writer.write(newContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {

                //Closing the resources
                reader.close();
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


