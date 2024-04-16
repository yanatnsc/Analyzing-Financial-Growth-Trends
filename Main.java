//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] growthPercentagesSample1 = {-5, -2, 0, 3, 10};
        System.out.println(Arrays.toString(squaredGrowth(growthPercentagesSample1))); // Output: [0, 4, 9, 25, 100]

        int[] growthPercentagesSample2 = {-8, -3, 2, 4, 12};
        System.out.println(Arrays.toString(squaredGrowth(growthPercentagesSample2))); // Output: [4, 9, 16, 64, 144]

        int[] growthPercentagesTest1 = {};
        System.out.println("Test 1 (List is empty): " + Arrays.toString(squaredGrowth(growthPercentagesTest1))); // Output: []

        int[] growthPercentagesTest2 = {-2, -1, 0, 1, 2};
        System.out.println("Test 2 (List will have repeated squared values): "
                + Arrays.toString(squaredGrowth(growthPercentagesTest2))); // Output: [0, 1, 1, 4, 4]

        int[] growthPercentagesTest3 = {-5, -4, -3, -2, -1};
        System.out.println("Test 3 (List is having all negative value): "
                + Arrays.toString(squaredGrowth(growthPercentagesTest3))); // Output: [1, 4, 9, 16, 25]
    }

    public static int[] squaredGrowth(int[] growthPercentages) {
        int[] squaredGrowth = new int[growthPercentages.length];
        for (int i = 0; i < growthPercentages.length; i++) {
            squaredGrowth[i] = growthPercentages[i] * growthPercentages[i];
        }
        Arrays.sort(squaredGrowth);
        return squaredGrowth;
    }
}