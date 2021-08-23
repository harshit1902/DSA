package dev.harshit;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class FindThePositionOfAnElementInAnInfiniteLengthArray {

    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170, 1000, 1300, 1400, 1600, 1700 ,10000, 13000, 14000, 16000, 17000};
        System.out.println(findPos(arr,10000));
    }

    static int findPos(int[] arr,int target){

        int start=0;
        int end=1;

        while(target>arr[end]){
            int newStart=end+1;
            end=end+((end-start+1)*2);

            // arr.length is just checked to deal with array index out of bound exception
            if(end>arr.length-1) {
                end = arr.length - 1;
                start=newStart;
                break;
            }

            start=newStart;
        }


        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){

        int mid;

        while(start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid])end=mid-1;
            else if(target>arr[mid])start=mid+1;
            else return mid;
        }

        return -1;

    }

}
