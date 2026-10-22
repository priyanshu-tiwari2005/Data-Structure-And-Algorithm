class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;

        while(x > 0){
            int lastDigit = (x % 10);
            reverse = (reverse * 10)+ lastDigit ;
            
            x = x/10 ;
        }
        if(original == reverse){
            return true;
        }
        return false;
    }
}