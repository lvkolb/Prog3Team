import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Helpers {

    // Lesen einer Textdatei in ein Stringarray
    public static String[] readTextdatei(String name) {
        String line;
        ArrayList<String> result = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(name);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null)
                result.add(line);
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return result.toArray(new String[]{});
    }

    // Schreiben eines Stringarray in eine Textdatei
    public static void writeTextdatei(String name, String[] lines) {
        try {
            FileWriter fw = new FileWriter(name);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < lines.length; i++)
                pw.println(lines[i]);
            pw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Berechnen des Hashwerts zu einem String und
    // Rückgabe als Hex-Zeichenkette
    public static String getHash(String w) {
        try {
            byte[] bytesOfMessage = w.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] thedigest = md.digest(bytesOfMessage);
            return String.format("%032x", new BigInteger(1, thedigest));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

}
