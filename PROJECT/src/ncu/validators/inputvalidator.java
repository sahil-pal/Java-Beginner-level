//declaring the package name
package ncu.validators;

public class inputvalidator {

    //method to check : Input time by the user is valid
    public static boolean time(float time){

        //setting condition
        if(time >= 0 && time <= 24){
            return true;
        }
        else{
            return false;
        }
    }


    //method to check the valid category input from the user
    public static boolean category(String category){

        //setting condition
        if(category.equals("productive") || category.equals("non productive") || category.equals("essential"))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
