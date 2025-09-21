package problems.binarysearch;

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] matriz = new int[3][4]; // 3 linhas, 4 colunas
        matriz[0] = new int[]{1,3,5,7};
        matriz[1] = new int[]{10, 11, 12, 13};
        matriz[2] = new int[]{14, 20, 30, 40};
        searchMatrix(matriz, 3);
    }

    public static boolean searhMatrixOnlyOnePass(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = (m * n) - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            int row = mid / n;
            int col = mid % n;
            int num = matrix[row][col];

            if(num == target) {
                return true;
            }else if(target > num) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix[0].length;
        int COLS = matrix.length;

        int top = 0;
        int bottom = ROWS - 1;

        while(top <= bottom) {
            int row = (top + bottom) / 2;

            if(target > matrix[row][COLS - 1]) {
                top = row + 1;
            } else if (target < matrix[row][0]) {
                bottom = row - 1;
            } else {
                break;
            }
        }

        if(!(top <= bottom)) {
            return false;
        }

        int row = (top + bottom) / 2;
        int l = 0;
        int r = COLS - 1;

        while(l <= r) {
            int mid = (l + r) / 2;

            if(matrix[row][mid] > target) {
                r = mid - 1;
            }else if(matrix[row][mid] < target) {
                l = mid + 1;
            }else {
                return true;
            }
        }

        return false;
    }
}
