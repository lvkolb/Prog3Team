public class Credentials {
    String login;
    String hash;

    Credentials(String login, String hash){
        Helpers helper = new Helpers();
        this.login = login;
        this.hash = helper.getHash(hash);
    }

    public boolean valid(){
        boolean checker = false;
        Helpers helper = new Helpers();
        String[] password = helper.readTextdatei("src/passwd.txt");
        for(int i = 0; i < password.length; i++){
            if(password[i].equals(login)){
                if(password[i+1].equals(hash)){
                    checker = true;
                }
            }
        }
        return checker;
    }
}