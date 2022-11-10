import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int maxAttempt = 3;
        int currentAttempt = 0;
        Scanner s = new Scanner(System.in);

        while(currentAttempt < maxAttempt){

            System.out.print("Benutzername: ");
            String login = s.next();
            System.out.print("Passwort: ");
            String pwd = s.next();


            Credentials userdata = new Credentials(login,pwd);

            if(userdata.valid()){
                s.close();
                System.out.println("Success!");
                currentAttempt = maxAttempt;
            }
            else{
                currentAttempt ++;
                if(currentAttempt == maxAttempt){
                    System.out.println("Access denied!");
                }
            }
        }
    }
}