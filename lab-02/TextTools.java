public class TextTools {

    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
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

    public static void main(String[] args) {
        System.out.println("countVowels(\"Education\") = " + countVowels("Education"));

        System.out.println("gradeLabel(85.0) = " + gradeLabel(85.0));
        System.out.println("gradeLabel(95.5) = " + gradeLabel(95.5));
        System.out.println("gradeLabel(50.0) = " + gradeLabel(50.0));
    }
}