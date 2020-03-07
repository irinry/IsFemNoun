public class ArrayStat {
    public static void main(String[] args) {
        int[] number = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int max = findMaxValue(number);
        System.out.println("Maximum Value is: " + max);

        int min = findMinValue(number);
        System.out.println("Minimum Value is: " + min);

        double average = findAverageValue(number);
        System.out.println("Average Value is: " + average);
    }

    public static int findMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int findMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static double findAverageValue(int[] numbers) {
        double averageValue = numbers[0];
        double sum = 0;
        for (int i = 1; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
            return sum / numbers.length;
    }
}
