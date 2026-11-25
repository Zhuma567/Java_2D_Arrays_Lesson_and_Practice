import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] == number && !found) {
                    System.out.println("Found at row " + i +
                            ", column " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }

        sc.close();
    }
}