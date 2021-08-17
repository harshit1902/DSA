package dev.harshit;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };

        int target=23;
        int[] ans=search(nums,target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int element){
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]==element) return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
