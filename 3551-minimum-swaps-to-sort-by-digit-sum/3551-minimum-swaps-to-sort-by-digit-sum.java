import java.util.*;
class Solution {
    public int getDigitSum(int n){
        int sum = 0;
        while(n != 0 ){
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n/10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n = nums.length;
       Integer[] sorted = new Integer[n];

        for (int i = 0; i < n; i++) {
            sorted[i] = nums[i];
        }

        Arrays.sort(sorted, (a, b) -> {
            int sum1 = getDigitSum(a);
            int sum2 = getDigitSum(b);

            if (sum1 != sum2) {
                return Integer.compare(sum1, sum2);
            }

            return Integer.compare(a, b);
        });


        HashMap<Integer , Integer>map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
           map.put(nums[i] , i);
        }

        int swapCount = 0;
        for(int i=0 ; i<n ; i++){
            int expectedVal = sorted[i];
            int currVal = nums[i];

            if(expectedVal == currVal){
                continue;
            }
            int idx = map.get(expectedVal);
            nums[i] = expectedVal ;
            nums[idx] = currVal ;

            map.put(expectedVal , i);
            map.put(currVal , idx);

            swapCount++;
        }
        return swapCount;
    }
}