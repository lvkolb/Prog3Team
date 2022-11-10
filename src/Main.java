import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int maxAttempt = 3;
        int currentAttempt = 0;

        if(login(maxAttempt, currentAttempt, System.in)){
            System.out.println("Success!");
        }
        else{
            System.out.println("Access denied!");
        }
    }

    private static boolean login(int maxAttempt, int currentAttempt, InputStream in) {
        boolean checker = false;
        Scanner s = new Scanner(in);
        while(currentAttempt < maxAttempt){

            System.out.print("Benutzername: ");
            String login = s.next();
            System.out.print("Passwort: ");
            String pwd = s.next();


            Credentials userdata = new Credentials(login,pwd);

            if(userdata.valid()){
                currentAttempt = maxAttempt;
                checker = true;
            }
            else{
                currentAttempt++;
            }
        }
        s.close();
        return checker;
    }
}