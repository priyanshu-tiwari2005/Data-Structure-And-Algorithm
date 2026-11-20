class Solution {
    
public int getValue(char c) {
    switch(c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;
    }
}

    public int romanToInt(String s) {
       int preVal = 0;
       int result = 0;
       int n = s.length();
       for(int i=n-1 ; i>=0 ; i--){
           int currVal = getValue(s.charAt(i));
           if(preVal > currVal){
             result -= currVal;
           }else{
            result += currVal;
           }
           preVal = currVal;
       }
       return result;
    }
}