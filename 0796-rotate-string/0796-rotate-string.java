class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();

        if(n != m){
            return false;
        }

        for(int i=0 ; i<n ; i++){
            boolean same = true;
            for(int j=0 ; j<n ; j++){
                if(s.charAt((j+i)%n)  != goal.charAt(j)){
                    same = false;
                }
            }
            if(same){
                return true;
            }
        }
        return false;
    }
}