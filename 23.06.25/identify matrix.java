public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        boolean isIdentity = true;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0))
                    isIdentity = false;
        System.out.println(isIdentity ? "Identity Matrix" : "Not an Identity Matrix");
    }
}