class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target < matrix[mid][0]) {
                high = mid - 1;
            } else if (target > matrix[mid][matrix[0].length - 1]) {
                low = mid + 1;
            } else {
                return findTarget(matrix, target, mid);
            }
        }

        return false;
    }

    public boolean findTarget(int[][] matrix, int target, int row) {
        int left = 0, right = matrix[0].length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (matrix[row][mid] == target)
                return true;
            else if (target < matrix[row][mid]) {
                right = mid - 1;
            } else
                left = mid + 1;

            // if ((left < matrix[0].length && target < matrix[row][left])
                // || (right > -1 && target > matrix[mid][right]))
                // return false;
        }

        return false;
    }
}
