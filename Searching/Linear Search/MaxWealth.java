package dev.harshit;

public class MaxWealth {
    public static void main(String[] args) {

        int[][] wealth={{1,2,3},{3,2,1},{56,75}};
        System.out.println(maxWealth(wealth));

    }
    static int maxWealth(int[][] arr){
        int ans=0;
        int numberOfPerson=arr.length;
        int[] wealth= new int[numberOfPerson];
        int personCount=0;

        for(int[] person:arr){
            int individualPersonWealth=0;
            for(int money:person){
                individualPersonWealth+=money;
            }
            wealth[personCount]=individualPersonWealth;
            personCount++;
        }

        for(int money:wealth ) {
            if (money > ans) ans = money;
        }

        return ans;
    }
}
