class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int topRow = 0;
        int bottomRow = m-1;
        int leftCol = 0;
        int rightCol = n-1;

        List<Integer>ans = new ArrayList<>();

        while(topRow <= bottomRow && leftCol <= rightCol){
            for(int j=leftCol ; j<=rightCol ; j++){
                ans.add(matrix[topRow][j]);
            }
            topRow++;
            for(int i=topRow ; i<=bottomRow ; i++){
                ans.add(matrix[i][rightCol]);
            }
            rightCol--;
            if(topRow <= bottomRow){
               for(int j=rightCol ; j>=leftCol ; j--){
                ans.add(matrix[bottomRow][j]);
              }
              bottomRow--;
            }
            
            if(leftCol <= rightCol){
              for(int i=bottomRow ; i>=topRow ; i--){
                ans.add(matrix[i][leftCol]);
              }
              leftCol++;
            }
            
        }
        return ans;
    }
}