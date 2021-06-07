//declaring the package name
package ncu.validators;

//import ncu.exceptions.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.util.*;


public class passwordvalidators {

    //declaring refernces for pattern and matcher
    public static Pattern pattern;
    public static Matcher matcher;

    //setting the pattern to be compared with
    private static final String PASSWORD_PATTERN = "^[a-z0-9_  - @ - # -$ -% - ^ -& -* - (-)-+-=-> -) -]{6,15}$";

    //method to compare the passed string with the pattern created
    public static boolean validate(String password) {

        //setting vaue of pattern to the patetern created
        pattern = Pattern.compile(PASSWORD_PATTERN);

        //matching the passed string with the created pattern
        matcher = pattern.matcher(password);

        //returning true if it matches
        return matcher.matches();
    }
}
