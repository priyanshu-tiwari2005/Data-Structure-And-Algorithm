class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[n-1];

        int m = Math.min(first.length() , last.length());
        String ans = "";
        for(int i=0 ; i<m ; i++){
            if(first.charAt(i) == last.charAt(i)){
                 ans += first.charAt(i);
            }else{
                return ans;
            }
        }
        if(ans.length() == 0){
            return "";
        }
        return ans;
    }
}