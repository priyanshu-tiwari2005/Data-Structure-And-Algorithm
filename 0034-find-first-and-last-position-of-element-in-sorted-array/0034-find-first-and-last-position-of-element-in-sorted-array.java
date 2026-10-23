class Solution {
    public int firstOccurence(int[] nums , int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int fr = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                fr = mid;
                end = mid - 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return fr;
    }
    public int lastOccurence(int[] nums , int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int lr = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                lr = mid;
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return lr;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = firstOccurence(nums , target);
        ans[1] = lastOccurence(nums , target);
        return ans;
    }
}