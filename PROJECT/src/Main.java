import ncu.processors.*;
import ncu.validators.*;
import ncu.exceptions.*;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args){

        // calling start interface
        timedelay.delay();
        loading.starting();
        timedelay.delay();

        // variable declarations
        int homepage = 1, dashboard = 1, addpage = 1, signup =1;
        int confirmation1 = 0;
        int confirmation2 = 0;

        // adding homepage label to use continue statement and return to starting point of program
        Homepage:

        //setting condition of label
        while (homepage == 1)
        {
            String username = "";
            Scanner sc = new Scanner(System.in);

            // displaying the homepage
            for(int i =0; i < 40; i++){
                System.out.println("");
            }
            System.out.println("                                                           --------------------------------------------------------------------------------------- ");
            System.out.println("                                                          |                                                                                       |");
            System.out.println("                                                          |                                                                                       |");
            System.out.println("                                                          |     Hello user, Welcome to .......                                                    |");
            System.out.println("                                                          |                                                                                       |");
            System.out.println("                                                          |                             _________________________                                 |");
            System.out.println("                                                          |                            | PRODUCTIVITY CALCULATOR |                                |");
            System.out.println("                                                          |                             -------------------------                                 |");
            System.out.println("                                                          |                                      Homepage                                         |");
            System.out.println("                                                          |                                                                                       |");
            System.out.println("                                                           --------------------------------------------------------------------------------------- ");
            System.out.println("                                                          |                                                                                       |");
            System.out.println("                                                          |                                                                                       |");
            System.out.println("                                                          |                                                                                       |");
            System.out.println("                                                          |    Already a user?  _______                                                           |");
            System.out.println("                                                          |    --- Press[1] to | Login |                                                          |");
            System.out.println("                                                          |                     -------                                                           |");
            System.out.println("                                                          |                                                                                       |");
            System.out.println("                                                          |    New user?        ________                                                          |");
            System.out.println("                                                          |    --- Press[2] to | signup |                                                         |");
            System.out.println("                                                          |                     --------                                                          |");
            System.out.println("                                                          |                                                                                       |");
            System.out.println("                                                           --------------------------------------------------------------------------------------- ");
            for(int i =0; i < 20; i++){
                System.out.println("");
            }



            // Input choice from the user
            int choice1 = sc.nextInt();

            //loading interface using time delay and load function
            loading.load1();
            timedelay.delay();
            loading.load2();
            timedelay.delay();



            // switch case
            switch (choice1) {

                case 1: {

                    // calling login page display function
                    login.displayloginpage();
                    username = sc.next();

                    // checking username in the file containing username
                    usernamevalidators.scanDetails(username);
                    try {
                        usernamevalidators.NotFound(username);
                    } catch (Exception e) {
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
                        System.out.println("                                                          |   " + e);
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
                        timedelay.delay();
                        continue Homepage;
                    }

                    // continuing the program, if the username exists
                    String password = sc.next();

                    // calling function to check the authentication
                    if (login.check(username, password) == true) {
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
                        System.out.println("                                                          |                             <  LOGIN SUCCESSFUL ..... >                               |");
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

                        confirmation1 = 1;//setting confirmation to 1 if user successfully logged in.
                    } else {
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
                        System.out.println("                                                          |                               <  LOGIN FAILED >                                       |");
                        System.out.println("                                                          |                                                                                       |");
                        System.out.println("                                                          |                         < CHECK USERNAME AND PASSWORD >                               |");
                        System.out.println("                                                          |                                                                                       |");
                        System.out.println("                                                          |                                                                                       |");
                        System.out.println("                                                          |                                                                                       |");
                        System.out.println("                                                          |                                                   Redirecting to the home page....    |");
                        System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                        for (int i = 0; i < 20; i++) {
                            System.out.println("");
                        }
                        timedelay.delay();
                        continue Homepage;
                    }
                    break;
                }


                case 2:
                    SIGNUP:
                    while (signup == 1) {

                        // calling sign up page display function
                        createuser.displaypage();
                        usernamevalidators.validationDispaly();

                        // Input username
                        username = sc.next();

                        //checking username validations
                        boolean valid1 = usernamevalidators.validate(username);

                        if (valid1 == true) {
                            //calling function to check whether selected correct usrname already exists or not
                            usernamevalidators.allReadyUsername(username);
                            if (usernamevalidators.exist == 0) {
                                String password = sc.next();
                                boolean valid2 = passwordvalidators.validate(password);
                                if (valid2 == true) {
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
                                    System.out.println("                                                          |                                < CONFIRM PASSWORD >                                   |");
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

                                    String cpassword = sc.next();
                                    if (createuser.confirm(password, cpassword) == 1) {

                                        // concatenating the username and password to save in userdetails file
                                        String credentials = String.format(username + "." + password);
                                        createuser.adduser(credentials, username);
                                        confirmation2 = 1;
                                        break;
                                    } else {
                                    }
                                } else {
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
                                    System.out.println("                                                          |              <  INVALID PASSWORD . ENTER PASSWORD BETWEEN 6 -15 CHARACTERS >          |");
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
                                    continue SIGNUP;

                                }
                            } else {
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
                                System.out.println("                                                          |                          < USERNAME ALREADY EXIST. TRY AGAIN >                        |");
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
                                continue SIGNUP;
                            }
                        } else {
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
                            System.out.println("                                                          |                           < INVALID USERNAME. TRY AGAIN >                             |");
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
                            continue SIGNUP;
                        }

                    }
                    break;



                // default case will re-direct to the Homepage of program
                default:
                    for(int i =0; i < 40; i++){
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
                    System.out.println("                                                          |                     < Oops :(, Please enter a valid choice.... >                      |");
                    System.out.println("                                                          |                                                                                       |");
                    System.out.println("                                                          |                                                                                       |");
                    System.out.println("                                                          |                                                                                       |");
                    System.out.println("                                                          |                             < Redirecting to Homepage >                               |");
                    System.out.println("                                                          |                                                                                       |");
                    System.out.println("                                                          |                                                                                       |");
                    System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                    for(int i =0; i < 20; i++){
                        System.out.println("");
                    }
                    timedelay.delay();
                    timedelay.delay();
                    continue Homepage;
            }






            /*This part will run when (i) the user had logged in successfully
                                     (ii) the new user id successfully created
             */

            if (confirmation1 == 1 || confirmation2 == 1) {
                Dashboard:
                while (dashboard == 1) {

                    // displaying the dashboard
                    for(int i =0; i < 40; i++){
                        System.out.println("");
                    }
                    System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                    System.out.println("                                                          |                                                                                       |");
                    System.out.println("                                                          |                             _________________________                                 |");
                    System.out.println("                                                          |                            | PRODUCTIVITY CALCULATOR |                                |");
                    System.out.println("                                                          |                             -------------------------                                 |");
                    System.out.println("                                                          |                                    Dash Board                                         |");
                    System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                    System.out.println("                                                          |                   ________________________                                            |");
                    System.out.println("                                                          |    --- Press[1]  | ADD TASK               |                                           |");
                    System.out.println("                                                          |                   ------------------------                                            |");
                    System.out.println("                                                          |                   ________________________                                            |");
                    System.out.println("                                                          |    --- Press[2]  | UPDATE TASK            |                                           |");
                    System.out.println("                                                          |                   ------------------------                                            |");
                    System.out.println("                                                          |                   ________________________                                            |");
                    System.out.println("                                                          |    --- Press[3]  | DELETE TASK            |                                           |");
                    System.out.println("                                                          |                   ------------------------                                            |");
                    System.out.println("                                                          |                   ________________________                                            |");
                    System.out.println("                                                          |    --- Press[4]  | DISPLAY TASK           |                                           |");
                    System.out.println("                                                          |                   ------------------------                                            |");
                    System.out.println("                                                          |                   ________________________                                            |");
                    System.out.println("                                                          |    --- Press[5]  | CALCULATE PRODUCTIVITY |                                           |");
                    System.out.println("                                                          |                   ------------------------                                            |");
                    System.out.println("                                                          |                   ________________________                                            |");
                    System.out.println("                                                          |    --- Press[6]  |    EXIT                |                                           |");
                    System.out.println("                                                          |                   ------------------------                                            |");
                    System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                    for(int i =0; i < 20; i++){
                        System.out.println("");
                    }


                    //Input choice from the user
                    int choice2 = sc.nextInt();

                    //loading interface using time delay and load function
                    loading.load1();
                    timedelay.delay();
                    loading.load2();
                    timedelay.delay();


                    // switch case
                    switch (choice2) {
                        case 1: {
                            int another = 1;// variable created to execute the code in loop
                            do {
                                for(int i =0; i < 40; i++){
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
                                System.out.println("                                                          |    ---> Enter CATEGORY [ productive / non-productive / essential (non - productive) ] |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TASK NAME                                                               |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TIME SPENT [in hours]                                                   |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                                for(int i =0; i < 20; i++){
                                    System.out.println("");
                                }

                                // add category of the task to be added.
                                String category = sc.next();

                                //show category entered on the screen
                                for(int i =0; i < 40; i++){
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
                                System.out.println("                                                          |    ---> Enter CATEGORY [ productive / non-productive / essential (non - productive) ] |");
                                System.out.println("                                                                    "+category                                                                      );
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TASK NAME                                                               |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TIME SPENT [in hours]                                                   |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                                for(int i =0; i < 20; i++){
                                    System.out.println("");
                                }

                                // add task name to be added
                                String task_name = sc.next();

                                //show the task name to be added on screen
                                for(int i =0; i < 40; i++){
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
                                System.out.println("                                                          |    ---> Enter CATEGORY [ productive / non-productive / essential (non - productive) ] |");
                                System.out.println("                                                                    "+category                                                                      );
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TASK NAME                                                               |");
                                System.out.println("                                                                    "+task_name);
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TIME SPENT [in hours]                                                   |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                                for(int i =0; i < 20; i++){
                                    System.out.println("");
                                }


                                // add time of the task to be added
                                float time = sc.nextFloat();

                                //calling input validator to check enter time is correct i.e ( 1 - 24 )
                                if (inputvalidator.time(time) == true) {
                                    //passing the category, taskname and time in save function

                                    add.save(username, category, task_name, time);

                                    for(int i =0; i < 40; i++){
                                        System.out.println("");
                                    }
                                    System.out.println("                                                        --------------------------------------------------------------------------------------- ");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                             _________________________                                 |");
                                    System.out.println("                                                       |                            | PRODUCTIVITY CALCULATOR |                                |");
                                    System.out.println("                                                       |                             -------------------------                                 |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                        --------------------------------------------------------------------------------------- ");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |    ---> Enter CATEGORY [ productive / non-productive / essential (non - productive) ] |");
                                    System.out.println("                                                                 "+category+"                                                                   ");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |    ---> Enter TASK NAME                                                               |");
                                    System.out.println("                                                                 "+task_name+"                                                                  ");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |    ---> Enter TIME SPENT [in hours]                                                   |");
                                    System.out.println("                                                                 "+time);
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                  ---> Press [1] to enter another task.                                |");
                                    System.out.println("                                                       |                  ---> Press [0] to exit                                               |");
                                    System.out.println("                                                        --------------------------------------------------------------------------------------- ");
                                    for(int i =0; i < 20; i++){
                                        System.out.println("");
                                    }

                                    // taking input to continue or exit
                                    another = sc.nextInt();
                                    } else {
                                    for (int i = 0; i < 40; i++) {
                                        System.out.println("");
                                    }
                                    System.out.println("                                                        --------------------------------------------------------------------------------------- ");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                             _________________________                                 |");
                                    System.out.println("                                                       |                            | PRODUCTIVITY CALCULATOR |                                |");
                                    System.out.println("                                                       |                             -------------------------                                 |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                        --------------------------------------------------------------------------------------- ");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                        < INVALID INPUT . PLEASE RE-ENTER TIME >                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                       |                                                                                       |");
                                    System.out.println("                                                        --------------------------------------------------------------------------------------- ");
                                    for (int i = 0; i < 20; i++) {
                                        System.out.println("");
                                    }
                                    
                                }

                            }while (another == 1);
                            continue Dashboard;
                            }

                        



                        case 2: {

                            int another = 1;// variable created to execute the code in loop
                            do {
                                for(int i =0; i < 40; i++){
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
                                System.out.println("                                                          |                   ^ ENTER THE DETAILS OF TASK YOU WANT TO CHANGE ^                    |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter CATEGORY [ productive / non-productive / essential (non - productive) ] |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TASK NAME                                                               |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TIME SPENT [in hours]                                                   |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                                for(int i =0; i < 20; i++){
                                    System.out.println("");
                                }

                                //Input details of the task to be updated
                                String category = sc.next();
                                String task_name = sc.next();
                                float time = sc.nextFloat();
                                //convert it into the format it is saved
                                String original = String.format("category:" + category + "                Task_name:" + task_name + "               Time_spent: " + time + " hrs");


                                for(int i =0; i < 40; i++){
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
                                System.out.println("                                                          |                  ^ ENTER THE DETAILS OF TASK YOU WANT TO REPLACE WITH ^               |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter CATEGORY [ productive / non-productive / essential (non - productive) ] |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TASK NAME                                                               |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TIME SPENT [in hours]                                                   |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                                for(int i =0; i < 20; i++){
                                    System.out.println("");
                                }


                                //Input details of the task to be replaced
                                String newcategory = sc.next();
                                String newtask_name = sc.next();
                                float newtime = sc.nextFloat();

                                //convert it into the format it is saved
                                String newtask = String.format("category:" + newcategory + "                Task_name:" + newtask_name + "               Time_spent: " + newtime + " hrs");


                                //calling the update function and passing the orginal and new task converted string
                                update.UpdateFile(username, original, newtask);

                                for(int i =0; i < 40; i++){
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
                                System.out.println("                                                          |                        ^  TASK UPDATED SUCCESSFULLY...  ^                             |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |         ---> Press [1] to UPDATE another task.                                        |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |         ---> Press [0] to EXIT.                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                                for(int i =0; i < 20; i++){
                                    System.out.println("");
                                }

                                // Input from user to continue or exit
                                another = sc.nextInt();
                            }
                            while (another == 1);
                            continue Dashboard;
                        }



                        case 3: {

                            int another = 1;// variable created to execute the code in loop
                            do {
                                for(int i =0; i < 40; i++){
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
                                System.out.println("                                                          |                  ^ ENTER THE DETAILS OF TASK YOU WANT TO DELETE ^                     |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter CATEGORY [ productive / non-productive / essential (non - productive) ] |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TASK NAME                                                               |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    ---> Enter TIME SPENT [in hours]                                                   |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                                for(int i =0; i < 20; i++){
                                    System.out.println("");
                                }

                                //Input details of the task to be deleted
                                String category = sc.next();
                                String task_name = sc.next();
                                float time = sc.nextFloat();

                                //convert it to format it is saved
                                String original = String.format("category:"+category+"                Task_name:"+task_name+"               Time_spent: "+time+" hrs");

                                //calling the delete function and passing the converted string which is to be deleted
                                delete.deleteFile(username, original);

                                for(int i =0; i < 40; i++){
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
                                System.out.println("                                                          |                        ^   TASK DELETED SUCCESSFULLY...  ^                            |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |         ---> Press [1] to DELETE another task.                                        |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |         ---> Press [0] to EXIT.                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                                for(int i =0; i < 20; i++){
                                    System.out.println("");
                                }

                                //Input from user to continue or exit
                                another = sc.nextInt();
                            }
                            while (another == 1);
                            continue Dashboard;
                        }



                        case 4: {
                            int another = 1;

                            do {
                                for (int i = 0; i < 40; i++) {
                                    System.out.println("");
                                }
                                System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                                System.out.println("                                                          |                                                                                            |");
                                System.out.println("                                                          |                                  _________________________                                 |");
                                System.out.println("                                                          |                                 | PRODUCTIVITY CALCULATOR |                                |");
                                System.out.println("                                                          |                                  -------------------------                                 |");
                                System.out.println("                                                          |                                        ^ TASK LIST ^                                       |");
                                System.out.println("                                                          |                                                                                            |");
                                System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                                System.out.println("                                                          |                                                                                            |");
                                System.out.println("                                                          |       USER :" + username  );
                                System.out.println("                                                          |                                                                                            |");
                                display.displaytask(username);
                                System.out.println("                                                          |                                                                                            |");
                                System.out.println("                                                          |                                                                                            |");
                                System.out.println("                                                          |       ---> Press [0] to EXIT.                                                              |");
                                System.out.println("                                                           -------------------------------------------------------------------------------------------- ");
                                for (int i = 0; i < 15; i++) {
                                    System.out.println("");
                                }
                                another = sc.nextInt();
                            }while (another == 1);
                            break;
                        }



                        case 5: {


                            int another = 1;// variable created to execute the code in loop

                            do {
                                for (int i = 0; i < 40; i++) {
                                    System.out.println("");
                                }
                                System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                             _________________________                                 |");
                                System.out.println("                                                          |                            | PRODUCTIVITY CALCULATOR |                                |");
                                System.out.println("                                                          |                             -------------------------                                 |");
                                System.out.println("                                                          |                                   ^  RESULTS ^                                        |");
                                System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |    USER :" + username);
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                Productivity_Calc.Totaltime(username);
                                System.out.println("                                                          |                                                                                       |");
                                Productivity_Calc.prod_time(username);
                                Productivity_Calc.calculate();
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |                                                                                       |");
                                System.out.println("                                                          |           ---> Press [0] to EXIT.                                                     |");
                                System.out.println("                                                           --------------------------------------------------------------------------------------- ");
                                for (int i = 0; i < 20; i++) {
                                    System.out.println("");
                                }

                                //Input form user to continue or exit
                                another = sc.nextInt();

                            }while (another == 1);
                            break;
                        }



                        case 6: {
                            //exit the dashboard
                            continue Homepage;
                        }
                    }

                }
            }
        }
    }
}
