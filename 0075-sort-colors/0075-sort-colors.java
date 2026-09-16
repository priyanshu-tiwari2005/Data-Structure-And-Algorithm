class Solution {
    public void sortColors(int[] nums) {
       int n = nums.length;
       int start = 0 ;
       int end = n-1;

       int k = 0;
       while(k <= end){
        if(nums[k] == 0){
            int temp = nums[start];
            nums[start] = nums[k];
            nums[k] = temp;
            start++;
            k++;
            
        }
        else if(nums[k] == 2){
            int temp = nums[end];
            nums[end] = nums[k];
            nums[k] = temp;
            end--;
           
            
        }
        else{
            k++;
        }
       

       }
      


    }
}