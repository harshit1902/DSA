package dev.harshit;

public class BinarySearch {
    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1,2,3,4,5},5));

    }

    // array must be sorted

    static int binarySearch(int[] arr,int target){

        if(arr.length==0)return -1;

        int start =0;
        int end= arr.length-1;
        int mid;

        while (start<=end){
//            mid=(start+end)/2;
            mid = start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else {
                return mid;
            }

        }

        return -1;
    }
}
