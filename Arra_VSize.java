class Arra_VSize {
    public static void main(String args[]) {
        int i, j, k = 0;
        int twoDim[][] = new int[3][];
        twoDim[0] = new int[1]; // First row has 1 column
        twoDim[1] = new int[2]; // Second row has 2 columns
        twoDim[2] = new int[3]; // Third row has 3 columns

        for (i = 0; i < 3; i++) {
            for (j = 0; j < i + 1; j++) {
                twoDim[i][j] = k + k * 3;
                k++;
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(twoDim[i][j] + " ");
            }
            System.out.println();
        }
    }
}
