class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n  - 1 ;
        int ans = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] > nums[n-1]){
                start = mid + 1;
            }else if(nums[mid] <= nums[n-1]){
                ans = nums[mid];
                end = mid - 1;
            }
        }
        return ans;
    }
}