class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
int high = matrix.length - 1;

while (low <= high) {
    int mid = (low + high) / 2;

    if (target < matrix[mid][0]) {
        high = mid - 1;
    }
    else if (target > matrix[mid][matrix[mid].length - 1]) {
        low = mid + 1;
    }
    else {
        // target belongs in this row
        return Arrays.binarySearch(matrix[mid], target) >= 0;
    }
}

return false;
    }
}
