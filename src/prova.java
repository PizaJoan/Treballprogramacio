import java.util.Arrays;

/**
 * Created by jpizaf on 07/12/16.
 */
public class prova {
    public static void main(String[] args) {
        String s = "pawsjnigopisdfgn";
        char[] orden = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            orden[i] = s.charAt(i);
        }

        for (int i = 0; i < orden.length; i++) {
            System.out.println(orden);
        }
    }
}
