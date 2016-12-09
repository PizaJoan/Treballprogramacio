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
            dimy ++;
        }
        char[][] matrix = new char[dimy][dim];
        int cont, zero, c;
        cont = 0;
        zero = (dim * dimy) - s.length();
        c = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == dimy - 1 && i >= dim - zero) {
                    continue;
                }
                matrix[j][i] = s.charAt(cont);
                cont++;
            }
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

    static int[] ordenat(String s) {
        StringBuilder sb = new StringBuilder(s);

        char [] orden = s.toCharArray();
        Arrays.sort(orden);

        int[] pos = new int[s.length()];

        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if (orden[i] == sb.charAt(j)) {
                    pos[i] = j;
                    sb.setCharAt(j, (char) 0);
                    break;
                }
            }
        }
        return pos;
    }

    static String cypher(String s, String key) {
        int dim, dimy, cont;
        cont = 0;
        dim = key.length();
        dimy = s.length() / dim;
        if ( s.length() % dim != 0 ) {
            dimy++;
        }
        char [][] matrix = new char[dimy][dim];
        int pos[] = ordenat(key);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (cont == s.length()) {
                    continue;
                }
                matrix[i][j] = s.charAt(cont);
                cont++;
            }
        }
        cont = 0;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][pos[i]] != 0) {
                    sb.setCharAt(cont, matrix[j][pos[i]]);
                    cont++;
                }
            }
        }

        return sb.toString();
    }

    static String decypher(String s, String key) {
        int dim = key.length();
        StringBuilder sb = new StringBuilder(s);
        int dimy = s.length() / dim;
        if (s.length() % dim != 0) {
            dimy ++;
        }
        char[][] matrix = new char[dimy][dim];
        int cont, zero, c;
        cont = 0;
        zero = (dim * dimy) - s.length();
        c = 0;
        int pos[] = ordenat(key);
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == dimy-1 && i == dim - zero) {
                    continue;
                }
                matrix[j][i] = s.charAt(cont);
                System.out.println(Arrays.deepToString(matrix));
                cont++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][pos[j]] != 0) {
                    sb.setCharAt(c, matrix[i][pos[j]]);
                    c++;
                }
            }
        }
        return sb.toString();
    }
}
