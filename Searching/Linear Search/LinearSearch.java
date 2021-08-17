package dev.harshit;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums={15,69,26,-65,59,25};
        int target=-65;
        int ans=linearSearch(nums,target);
        System.out.println(ans);

    }

    // search in the array: return the index if item found
    //return -1 if not found
    static int linearSearch(int[] arr, int element){
        if(arr.length==0) return -1;

        // run a for loop
        for(int i=0;i<arr.length;i++){
            // for every index check if the element at the index is equal to element
            if(arr[i]==element) return i;
        }

        return -1;
    }
}
