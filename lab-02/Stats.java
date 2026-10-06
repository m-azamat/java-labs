public class Stats {
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }
    public static int max(int[] values) {
        int best = values[0];
        for(int value : values) {
            if(value > best) best = value;
        }
        return best;
    }

    public static void main(String[] args) {
        int[] data = {80, 90, 70, 100};
        System.out.println("sum = " + sum(data));
        System.out.println("average = " + average(data));
        System.out.println("max = " + max(data));
    }
}
