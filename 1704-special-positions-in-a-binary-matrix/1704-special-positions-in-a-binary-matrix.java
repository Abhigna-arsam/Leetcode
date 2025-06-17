class Solution {
    public int numSpecial(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int [] rowCount = new int[rows];
        int [] colCount = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int count=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    if (rowCount[i] == 1 && colCount[j] ==1) {
                        count++;
                    }
                }
            }
        }
        
        return count;
        // int m = mat.length;//col
        // int n = mat[0].length;//row
        // int[] rC = new int[m];
        // int[] cC = new int[n];
        // int ans=0;
        // for(int i = 0; i<m; i++){
        //     for(int j = 0; j<n; j++){
                
        //         if(mat[i][j]==1){
        //             rC[i]+=1;
        //             cC[j]+=1;
        //         }
        //     }
        // }

        // for(int i = 0; i<m; i++){
        //     for(int j = 0; j<n; j++){
        //         if(mat[i][j]==0) continue;
        //         if (mat[i][j] == 1) {
        //             if(rC[i]==1 && cC[j]==1){
        //                 ans++;
        //             }
        //         }
        //     }
        // }

        // return ans;

    }
}