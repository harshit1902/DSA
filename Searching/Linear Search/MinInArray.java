package dev.harshit;

public class MinInArray {
    public static void main(String[] args) {
        int[] nums={5,7,6,9,3,36,-622,322};
        System.out.println(min(nums));
    }

    static int min(int[] arr){
        int minNum = Integer.MAX_VALUE;
        for(int num:arr){
            if(num<minNum)minNum=num;
        }
        return minNum;
    }

}
