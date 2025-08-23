
public class Water_trap {

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

int maxWater=0;

        //find left max boundry
        int left = height[0];
        int leftMax = height[left];
        for (int i = 0; i < height.length; i++) {
            leftMax = Math.max(height[i],leftMax);
        }
        //find right max boundry 
        int right = height[height.length-1];
        int rightMax = height[right];
        for (int i = height.length-1; i >= 0; i--){
          rightMax = Math.max(height[i],right);
        }

        //calculate waterTape
for (int i = 0; i < height.length; i++) {
  maxWater = (leftMax - rightMax)*1;
}

System.out.println( maxWater);

    }

}
