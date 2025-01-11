import java.util.Arrays;

public class RandomValueAnalysis {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; // Generate 4-digit random numbers
        }
        return numbers;
    }

    // Method to find average, min, and max values of an array
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomValueAnalysis analysis = new RandomValueAnalysis();

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = analysis.generate4DigitRandomArray(5);
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, and max
        double[] results = analysis.findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f%n", results[0], results[1], results[2]);
    }
}
