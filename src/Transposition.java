
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
        for (int i = 0; i < s.length() - dim; i++) {
            for (char[] correcte : matrix) {
                if (correcte[i] != 0) {
                    sb.append(correcte[i]);
                }
            }
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
