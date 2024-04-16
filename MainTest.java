import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void squaredGrowth() {
        // Test 1: List is empty
        int[] growthPercentagesTest1Input = {};
        int[] growthPercentagesTest1Output = {};
        assertArrayEquals(growthPercentagesTest1Output, Main.squaredGrowth(growthPercentagesTest1Input));

        // Test 2: List will have repeated squared values
        int[] growthPercentagesTest2Input = {-2, -1, 0, 1, 2};
        int[] growthPercentagesTest2Output = {0, 1, 1, 4, 4};
        assertArrayEquals(growthPercentagesTest2Output, Main.squaredGrowth(growthPercentagesTest2Input));

        // Test 3: sList is having all negative value
        int[] growthPercentagesTest3Input = {5, -4, -3, -2, -1};
        int[] growthPercentagesTest3Output = {1, 4, 9, 16, 25};
        assertArrayEquals(growthPercentagesTest3Output, Main.squaredGrowth(growthPercentagesTest3Input));
    }

}