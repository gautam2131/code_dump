import java.util.*;

class CheckMagicSquare {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String checkMagicSquare(int n, int[][] grid) {
      int pDig = 0;
      int sDig = 0;
      for(int i=0;i<n;i++){
          pDig += grid [i][i];
          sDig += grid [(n-1)-i][i];
      }
      if(pDig != sDig ) return "No" ;
      for(int i =0; i<n;i++){
          int rowSum =0 , colSum =0;
          for(int j = 0; j<n ;j++){
              rowSum += grid[i][j];
              colSum += grid[j][i];
          }
          if(rowSum !=pDig || colSum != pDig) return "No";
      }
      return "Yes";
    }
}

