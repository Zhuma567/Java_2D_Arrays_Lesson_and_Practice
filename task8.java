import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.print("Enter threshold: ");
        int number = sc.nextInt();

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > number) {
                    count++;
                }
            }
        }

        System.out.println("Count: " + count);

        sc.close();
    }
}