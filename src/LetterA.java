public class LetterA {
    public static void main(String[] args) {
        String[][] arr = new String[6][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == 2) {
                    arr[i][j] = " * ";
                } else if (j == 0 || j == 4) {
                    arr[i][j] = " * ";
                } else {
                    arr[i][j] = "   ";
                }
            }
        }

        for (String[] row : arr) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
