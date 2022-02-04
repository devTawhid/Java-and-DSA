package com.qBinarySearch;

//https://leetcode.com/problems/search-a-2d-matrix/
public class p74Searcha2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                boolean res = searchMatrix(matrix,matrix[i][j]);
                System.out.print(res + " ");
            }
            System.out.println();
        }
        System.out.println(searchMatrix(matrix,- 200));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int start = 0, end = row - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(matrix[mid][col - 1] == target)
                return true;
            else if( start + 1 == end)
                break;
            else if(matrix[mid][col - 1] < target)
                start = mid;
            else if(matrix[mid][col - 1] > target)
                end = mid;
        }
        end = (matrix[start][col - 1] >= target) ? start: end;
//        System.out.println(start + " " + end);

        int newStart = 0, newEnd = col - 1;
        while (newStart <= newEnd) {
            int mid = newStart + (newEnd - newStart) / 2;
            if(matrix[end][mid] == target || matrix[end][newStart] == target || matrix[end][newEnd] == target)
                return true;
            else if (matrix[end][mid] < target)
                newStart = mid + 1;
            else if (matrix[end][mid] > target)
                newEnd = mid - 1;
        }
        return false;
    }
}
