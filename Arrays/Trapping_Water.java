
public class Trapping_Water {

    public static void trappWater(int height[]) {
        int n = height.length;
        int width = 1; // Each bar is of width 1

        // Step 1: Calculate left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
            // System.out.println(leftMax[i]); // 4 4 6 6 6 6
        }

        // Step 2: Calculate right max boundary array
        int rightMax[] = new int[n];
        // 5 = 5
        rightMax[n - 1] = height[n - 1]; // 5
        // 2 , 3 , 6 , 0 , 2 , 4
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]); // 6
            // System.out.println(leftMax[i]);
        }

        // Step 3: Calculate trapped water at each position
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]); // 6 , 5
            // System.out.println(waterLevel);
            trappedWater += (waterLevel - height[i]) * width; //
        }

        // Step 4: Print result
        System.out.println("Total trapped water: " + trappedWater);
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1 };
        trappWater(height);
    }
}
