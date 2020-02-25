package LeetCode;

public class N62UniquePaths {

    public int uniquePaths(int m, int n) {


        if(m==1&&n==1){
            return 1;
        }

        int[][] ans = new int[m][n];

        for(int column=0;column<n;column++){
            ans[0][column] = 1;
        }
        for(int row=0;row<m;row++){
            ans[row][0] = 1;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                ans[i][j] = ans[i-1][j]+ans[i][j-1];
            }
        }
        return ans[m-1][n-1];

    }
}
