class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean isSorted = true;

        for(int i=1 ; i<n ; i++){
            if(s.charAt(i) < s.charAt(i-1) ){
                isSorted = false;
            }
        }

        if(isSorted == true){
            return 0;
        }
        if(n == 2){
            return -1;
        }

        char min_Char = s.charAt(0);
        char max_Char = s.charAt(0);

        for(int i=1 ; i<n ; i++){
            min_Char = (char)Math.min(min_Char , s.charAt(i));
            max_Char = (char)Math.max(max_Char , s.charAt(i));
        }

        if(s.charAt(0) ==  min_Char || s.charAt(n-1) == max_Char){
            return 1;
        }

        for(int i=1 ; i<n-1 ; i++){
            if(s.charAt(i) ==  min_Char || s.charAt(i) == max_Char){
                return 2;
            }
        }

        return 3;
    }
}