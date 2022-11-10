public class Credentials {
    String login;
    String hash;

    Credentials(String login, String hash){
        this.login = login;
        this.hash = hash;
    }

    public boolean valid (){
        /*
         *   String kombinieren
         *   auf text Datei zugreifen und überprüfen ob der String enthalten ist
         *
         * */
        return true;
    }
}