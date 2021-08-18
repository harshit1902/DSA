package dev.harshit;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={5,7,66,9,3,36,-62,322};
        System.out.println(evenDigits(nums));

    }
    static int evenDigits(int[]arr){
        if(arr.length==0)return -1;
        int ans=0;
        for (int num:arr){
            int count=0;
            if(num==0)count=1;
            if(num<0)num=-1*num;
//            while (num!=0){
//                num=num/10;
//                count++;
//            }
            count=(int)(Math.log10(num))+1;
            if(count%2==0)ans++;
        }
        return ans;
    }
}
