package Matrices;

public class ALgo {

    public static void main(String[] args) {

        String str = "a, b, c, d, e, f, g, h, i, j, k, l, m, , n, o, p";



        System.out.println(FormatMatrix(str,22,5)); 

    }

    public static String FormatMatrix(String str, int rows, int columns) {
        try {
            String[][] matrix = new String[rows][columns];
            String[] arr = str.split("\\s*,\\s*");

            int k = 0;
            int s = arr.length;

            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < columns; ++j) {
                    matrix[i][j] = (k < s) ? arr[k] : "*";
                    ++k;
                }
            }

            String append = "", result;

            for (int i = 0; i < rows; ++i) {
                append += "|\t";
                for (int j = 0; j < columns; ++j) {
                    append += matrix[i][j] + "\t";
                }
                append += "|\n";
            }
            result = append;
            return result;

        } catch (Exception e) {
            return null;
        }
    }

}
