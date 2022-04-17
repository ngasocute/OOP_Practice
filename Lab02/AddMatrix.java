package Lab02;

public class AddMatrix {
    // add 2 matrix
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] mat2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        AddMatrix add = new AddMatrix();
        int[][] result = addMatrix(mat1, mat2);
        add.printMatrix(result);
    }
}