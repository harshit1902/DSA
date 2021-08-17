package dev.harshit;

public class SearchInRange {
    public static void main(String[] args) {

        int[] nums={5,7,6,9,3,36,-622,322};
        int target=36;
        int start=2;
        int end=5;
        System.out.println(search(nums,target,start,end));

    }
    static boolean search(int[] arr,int element,int start,int end){
        if(arr.length==0) return false;
        if(!(start<=end&&start>=0&&end<=arr.length-1)) return false;

        for(int i=start;i<=end;i++){
            if(arr[i]==element)return true;
        }
        return false;
    }
}
