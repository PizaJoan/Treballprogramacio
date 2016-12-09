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

    static int[] ordenat(String s, int dimy) {
        StringBuilder sb = new StringBuilder(s);
        int cont;
        cont = 0;
        char[] orden = new char[s.length()];
        int[] pos = new int[s.length()];

        for (int i = 0; i < sb.length(); i++) {
            orden[i] = sb.charAt(i);
        }
        Arrays.sort(orden);
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if (orden[i] == sb.charAt(j)) {
                    pos[i] = cont;
                    sb.setCharAt(j, (char) 0);
                    break;
                }
                cont++;
            }
            cont = 0;
        }
        int ar[] = new int[pos.length + 1];
        for (int i = 0; i < pos.length; i++) {
            ar[i] = pos[i];
        }
        if (pos.length < dimy) {
            for (int i = 0; i < dimy; i++) {
                if (i == dimy - 1) {
                    ar[i] = i;
                    break;
                }
            }
        }
        return ar;
    }



    static String cypher(String s, String key) {
        int dim, dimy, cont, cont1;
        cont = 0;
        dim = key.length();
        dimy = s.length() / dim;
        if ( s.length() % dim != 0 ) {
            dimy++;
        }
        char [][] matrix = new char[dimy][dim];
        int pos[] = ordenat(key, dimy);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (cont == s.length()) {
                    continue;
                }
                matrix[pos[i]][j] = s.charAt(cont);
                cont++;
            }
        }
        cont1 = 0;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[pos[j]][pos[i]] != 0) {
                    sb.setCharAt(cont1, matrix[pos[j]][pos[i]]);
                    cont1++;
                }
            }
        }

        return sb.toString();
    }

    static String decypher(String s, String key) {
        return null;
    }
}
