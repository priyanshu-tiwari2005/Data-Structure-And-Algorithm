class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int pos = n;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                pos = mid + 1;
                start = mid+1;
            }else{
                pos = mid;
                end = mid - 1;
            }
        }
        return pos;
    }
}