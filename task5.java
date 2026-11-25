public class task5 {
    public static void main(String[] args) {

        int[][] a = {
                {12, 5, 8, 20},
                {3, 15, 7, 11},
                {25, 1, 18, 9}
        };

        int min = a[0][0];
        int max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] < min) {
                    min = a[i][j];
                }

                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}