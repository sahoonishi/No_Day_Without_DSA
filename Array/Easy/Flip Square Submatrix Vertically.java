class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        // int i=x;
        int j=x+k-1;
        if(k==1) return grid;

        for(int row=x;row<j;row++){
                // i
            for(int col=y;col<k+y;col++){
                int temp = grid[row][col];
                grid[row][col] = grid[j][col];
                grid[j][col] = temp;
            }
            j--;
        }
        return grid;
    }
}


// 0ms beats 100% o(ksquare) , 47.18mb memory  
