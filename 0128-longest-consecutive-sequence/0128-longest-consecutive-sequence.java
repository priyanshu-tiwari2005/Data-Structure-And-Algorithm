class Solution {
    public int longestConsecutive(int[] nums) {
        int n =  nums.length;
        int temp = 1;
        int max = 1;
        Arrays.sort(nums);
        if(n == 0){
            return 0;
        }

        for(int i=1 ; i<n ; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else if(nums[i] == nums[i-1] + 1){
                temp++;
            }else{
                max = Math.max(temp , max);
                temp = 1;
            }
        }
        return Math.max(temp , max);

    }
}