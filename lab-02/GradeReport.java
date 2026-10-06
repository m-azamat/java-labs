public class GradeReport {

    public static double average(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }

    public static String gradeLabel(double average) {
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 70) {
            return "Good";
        } else {
            return "Keep practising";
        }
    }

    public static int countAbove(int[] scores, double threshold) {
        int count = 0;
        for (int score : scores) {
            if (score > threshold) {
                count++;
            }
        }
        return count;
    }

    public static void printReport(String courseName, int[] scores) {
        double avg = average(scores);
        System.out.println("Course: " + courseName);
        System.out.println("Average: " + avg);
        System.out.println("Label: " + gradeLabel(avg));
        System.out.println("Above average: " + countAbove(scores, avg));
    }

    public static void main(String[] args) {
        int[] cs101 = {80, 90, 85, 70, 100};
        int[] cs102 = {95, 90};

        printReport("CS101", cs101);
        System.out.println();
        printReport("CS102", cs102);
    }
}