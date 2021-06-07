//declaring the package name
package ncu.processors;

public class timedelay {

    //function created to give a time delay while running the program for better interface
    public static void delay(){

        try{
            //using inbuild function and setting time of delay to 1.1 seconds
            Thread.sleep(1100);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
