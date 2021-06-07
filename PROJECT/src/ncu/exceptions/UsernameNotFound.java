// declaring the package name
package ncu.exceptions;


public class UsernameNotFound extends Exception{

        // method to pass username to exception constructor
       public UsernameNotFound(String username){
          super(username);

    }
}
