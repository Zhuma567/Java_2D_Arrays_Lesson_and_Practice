public class task12 {
    public static void main(String[] args) {

        int[][] grades = {
                {90, 85, 80, 95},
                {75, 88, 92, 80},
                {100, 95, 90, 85}
        };

        int max = grades[0][0];
        int total = 0;

        for (int i = 0; i < grades.length; i++) {

            int sum = 0;

            for (int j = 0; j < grades[i].length; j++) {

                sum += grades[i][j];
                total += grades[i][j];

                if (grades[i][j] > max) {
                    max = grades[i][j];
                }
            }

            double average = (double) sum / grades[i].length;

            System.out.println("Student " + (i + 1) +
                    " average: " + average);
        }

        double overallAverage =
                (double) total / (grades.length * grades[0].length);

        System.out.println("Class maximum: " + max);
        System.out.println("Overall average: " + overallAverage);
    }
}