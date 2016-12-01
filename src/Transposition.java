import java.util.Arrays;

public class Transposition {
    static String cypher(String s, int dim) {
        StringBuilder sb = new StringBuilder();
        int dimy = (int) Math.ceil(s.length() / (double) dim);
        char[][] matrix = new char[dimy][dim];
        int cont = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (cont == s.length()) {
                    matrix[i][j] = 0;
                    continue;
                }
                matrix[i][j] = s.charAt(cont);
                cont++;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (char[] correcte : matrix) {
                if (correcte[i] != 0) {
                    sb.append(correcte[i]);
                }
            }
        }
        return sb.toString();
    }

    static String decypher(String s, int dim) {
        StringBuilder sb = new StringBuilder();
        int dimy = (int) Math.ceil(s.length() / (double) dim);
        char[][] matrix = new char[dim][dimy];
        int cont = 0;
        int x = 0;
        int y = 0;
        int zero = (dim*dimy) - s.length()-1;
        System.out.println(zero);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < dimy; j++) {
                if ( y == zero && x == (dimy-1) ) {
                    matrix[x][zero] = 0;
                    zero++;
                    continue;
                }
                // System.out.println(Arrays.deepToString(matrix));
                if (cont == s.length()) {
                    matrix[y][x] = 0;
                    continue;
                }
                matrix[y][x] = s.charAt(cont);
                cont++;
                y++;
                System.out.println(Arrays.deepToString(matrix));
            }
            y = 0;
            x++;
        }
        return sb.toString();
    }


    static String cypher(String s, String key) {
        return null;
    }

    static String decypher(String s, String key) {
        return null;
    }
}
