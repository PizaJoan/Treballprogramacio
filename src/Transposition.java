import java.util.Arrays;

public class Transposition {
    static String cypher(String s, int dim) {
        int dimy = s.length() / dim;
        if (s.length() % dim != 0) {
            dimy += 1;
        }
        char[][] matrix = new char[dimy][dim];
        int cont = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (cont == s.length()) {
                    continue;
                }
                matrix[i][j] = s.charAt(cont);
                cont++;
            }
        }
        StringBuilder sb = new StringBuilder(s);
        int c = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] != 0) {
                    sb.setCharAt(c, matrix[j][i]);
                    c++;
                }
            }
        }
        return sb.toString();
    }

    static String decypher(String s, int dim) {
        StringBuilder sb = new StringBuilder(s);
        int dimy = s.length() / dim;
        if (s.length() % dim != 0) {
            dimy += 1;
        }
        char[][] matrix = new char[dimy][dim];
        int cont, x, y, zero, c;
        cont = 0;
        x = 0;
        y = 0;
        zero = (dim * dimy) - s.length();
        c = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (y == dimy - 1 && x >= dim - zero) {
                    continue;
                }
                matrix[y][x] = s.charAt(cont);
                cont++;
                y++;

            }
            x++;
            y = 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    sb.setCharAt(c, matrix[i][j]);
                    c++;
                }
            }
        }
        return sb.toString();
    }

    static int [] ordenat(String s) {
        int[] orden = new int[s.length()];
        int pos, lletra;
        pos = 0;
        lletra = 0;
        for (int i = 0; i < s.length(); i++) {
            if (lletra < s.charAt(i)) {
                lletra = s.charAt(i);
                pos++;
                orden[i] = pos;
            }
        }
        return orden;
    }


    static String cypher(String s, String key) {
        int dim, dimy;
        dim = key.length();
        dimy = s.length() / dim;
        if ( s.length() % dim != 0 ) {
            dimy++;
        }
        char [][] matrix = new char[dimy][dim];
        return null;
    }

    static String decypher(String s, String key) {
        return null;
    }
}
