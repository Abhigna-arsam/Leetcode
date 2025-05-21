class Solution {
    public void setZeroes(int[][] matrix) {
        //   int n = matrix.length;
        // int m = matrix[0].length;
        // boolean Frow = false,Fcol=false;
        // // Step 1: Use the first row and column as markers
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (matrix[i][j] == 0) {
        //             if (i == 0) Frow = true; // Mark first row for zeroing
        //             if (j == 0) Fcol = true; // Mark first column for zeroing
        //             matrix[i][0] = 0; // Mark row
        //             matrix[0][j] = 0; // Mark column
        //         }
        //     }
        // }

        // // Step 2: Update the matrix based on markers
        // for (int i = 1; i < n; i++) { // Start from 1 to avoid overwriting the markers
        //     for (int j = 1; j < m; j++) {
        //         if (matrix[i][0] == 0 || matrix[0][j] == 0) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        // // Step 3: Handle the first row if needed
        // if (Frow) {
        //     for (int j = 0; j < m; j++) {
        //         matrix[0][j] = 0;
        //     }
        // }

        // // Step 4: Handle the first column if needed
        // if (Fcol) {
        //     for (int i = 0; i < n; i++) {
        //         matrix[i][0] = 0;
        //     }
        // }
        boolean firstRowZero = false;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) {
                        firstRowZero = true;
                        matrix[0][j] = 0;
                    } else {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }
        for(int i = 1; i < matrix.length; i++) {
            if(matrix[i][0] == 0) {
                for(int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[0][j] == 0) {
                for(int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowZero) {
            for(int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    

  
    }
}