package practice.strings;

/**
 * Created with IntelliJ IDEA.
 * User: paul
 * Date: 9/15/13
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        int counter = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = counter;
                counter++;
            }
        }

        int[][] rotated = rotate(matrix);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(rotated[i][j]);
            }
        }
    }

    public static int[][] rotate(int[][] matrix) {
        int[][] rotated = new int[2][2];
        for (int col = 0; col < matrix.length; col++) {
            for (int row = matrix.length - 1; row >= 0; row--) {
                rotated[col][row] = matrix[row][col];
//                System.out.println(matrix[row][col]);
            }
        }
        return rotated;
    }


}
