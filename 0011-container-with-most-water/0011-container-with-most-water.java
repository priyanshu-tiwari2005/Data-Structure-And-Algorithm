class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n - 1 ;
        int maxWater = Integer.MIN_VALUE;

        while(start < end){
            int ht = Math.min(height[start] , height[end]);
            int width = end - start ;
            int area = ht * width ;
            maxWater = Math.max(area , maxWater);

            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }

        }
        return maxWater;
    }
}