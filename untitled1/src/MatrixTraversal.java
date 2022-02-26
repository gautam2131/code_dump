import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MatrixTraversal  {

    public List<Integer> matrixTraversal(int[][] matrix, int currPosRow, int currPosCol, int dirToMove, int stepsToMove) {
        List<Integer> res = new ArrayList<Integer>();
        int colLength = matrix[0].length, rowLength = matrix.length;
        if (currPosRow >= rowLength || currPosCol >= colLength) {
            res.add(-1);
            return res;
        }
        switch (dirToMove) {
            case 1:
                if (currPosCol + stepsToMove >= colLength) {
                    res.add(-1);
                    return res;
                } else {
                    for (int i = currPosCol + 1; i <= currPosCol + stepsToMove; i++) {
                        res.add(matrix[currPosRow][i]);
                    }
                }
                return res;
            case 2:
                if (currPosRow + stepsToMove >= rowLength) {
                    res.add(-1);
                    return res;
                } else {
                    for (int i = currPosRow + 1; i <= currPosRow + stepsToMove; i++) {
                        res.add(matrix[i][currPosCol]);
                    }
                }
                return res;
            case 3:
                if (currPosCol - stepsToMove < 0) {
                    res.add(-1);
                    return res;
                } else {
                    for (int i = currPosCol - 1; i >= 0; i--) {
                        res.add(matrix[currPosRow][i]);
                    }
                }
                return res;
            case 4:
                if (currPosRow - stepsToMove < 0) {
                    res.add(-1);
                    return res;
                } else {
                    for (int i = currPosRow - 1; i >= 0; i--) {
                        res.add(matrix[i][currPosCol]);
                    }
                }
                return res;
            default:
                break;
        }

        return res;
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int currPosX = scanner.nextInt();
        int currPosY = scanner.nextInt();
        int dirToMove = scanner.nextInt();
        int stepsToMove = scanner.nextInt();

        scanner.close();
        List<Integer> result = new MatrixTraversal().matrixTraversal(matrix, currPosX, currPosY, dirToMove, stepsToMove);

        for (int i = 0; i < result.size(); ++i) {
            System.out.printf("%d ", result.get(i));
        }
    }
}
