
/* You are given an array of non-negative integers heights representing an elevation map where the width of each bar is 1. Your task is to compute how much rainwater would be trapped between the bars after a heavy rain.

Example
Input: heights = [4, 2, 0, 6, 3, 2, 5]

Output: 9

Explanation
The elevation map can be visualized as a series of bars. The trapped rainwater at any position is determined by the shorter of the two surrounding tallest bars (one to its left and one to its right).  For instance, at index 2 (bar with height 0), the tallest bar to its left is of height 4 and to its right is 6. The shorter of these two is 4. Thus, the water level at this position is 4, and the trapped water is 4−0=4. By calculating this for each bar, we can find the total trapped water. */

public class TrappedRainwater {

    public static int TrappedRainwater(int height[]) {
        //calculate left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]); 
        }
        //calculate right max boundary -array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]); 
        }

        int trappedWater = 0;

        //loop
        for(int i=0;i<height.length;i++){
            // waterLevel = min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //TrappedWater = waterLevel - height[i];
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
    
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int TrappedRainwaterheight = TrappedRainwater(height);
        System.out.println(TrappedRainwaterheight);
    }
}
