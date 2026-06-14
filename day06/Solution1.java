package day06;
import java.util.*;

class Solution {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        HashSet<Integer> set = new HashSet<>();
        //int poisoined = 0;
        for(int i=0;i<timeSeries.length;i++){
           // set.add(timeSeries[i])
           while(timeSeries[i]<=(timeSeries[i]+duration)-1){
            set.add(i);
            i++;
           }
        }
        return set.size();
    }

    // this was not the optimal aproach 
     public static int PoisonedDuration(int[] timeSeries, int duration) {
        int poisoned = 0 ;
        for(int i=0;i<timeSeries.length-1;i++){
            poisoned = Math.min(duration, (timeSeries[i+1]-timeSeries[i]));
        }
        poisoned += duration;

        return poisoned;
     }
    public static void main(String args[]){
        int timeSeries[] = {1,4};
        int duration = 2;
        int result = PoisonedDuration(timeSeries,duration);
        System.out.println(result);
    }
}
