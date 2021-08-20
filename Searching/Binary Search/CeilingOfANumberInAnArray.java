package dev.harshit;

public class CeilingOfANumberInAnArray {
    public static void main(String[] args) {

        int[] nums={1,2,3,6,9,18,22};
        int[] numsDesc={22,18,9,6,3,2,1};
        int target=15;

        System.out.println(ceil(numsDesc,target));
        System.out.println(ceil(nums,target));

    }

    static int ceil(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        int mid;
        boolean isAsc=arr[arr.length-1]>arr[0];
        while(start<=end){

            mid=start+(end-start)/2;
            if (arr[mid] == target) return arr[mid];
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if(target<arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }

        return isAsc?arr[start]:arr[end];
    }
}
