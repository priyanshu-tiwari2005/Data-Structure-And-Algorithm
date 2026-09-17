class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int temp = 0;
        int max = 0;

        for(int i=0 ; i<n ; i++){
            if(nums[i] == 1){
                temp++;
                max = Math.max(max , temp);
            }else{
                temp = 0;
            }
        }
        return max;
    }
}