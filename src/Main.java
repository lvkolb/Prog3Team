import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int maxAttempt = 3;
        int currentAttempt = 0;
        Scanner s = new Scanner(System.in);

        if(login(maxAttempt, currentAttempt, s)){
            System.out.println("Success!");
        }
        else{
            System.out.println("Access denied!");
        }
    }

    private static boolean login(int maxAttempt, int currentAttempt, Scanner s) {
        boolean checker = false;
        while(currentAttempt < maxAttempt){

            System.out.print("Benutzername: ");
            String login = s.next();
            System.out.print("Passwort: ");
            String pwd = s.next();


            Credentials userdata = new Credentials(login,pwd);

            if(userdata.valid()){
                s.close();
                currentAttempt = maxAttempt;
                checker = true;
            }
            else{
                currentAttempt++;
            }
        }
        return checker;
    }
}