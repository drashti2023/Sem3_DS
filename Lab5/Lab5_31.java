public class Lab5_31 {

    public static void main(String[] args) {
        int r1 = 3, c1 = 2;
        int r2 = 2, c2 = 3;
        int a[][]= {{2,3},{4,0},{-1,7}};
        int b[][]= {{2,9,8},{5,6,4}};
       
        // Mutliplying Two matrices
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Multiplication of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}