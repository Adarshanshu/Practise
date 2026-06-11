import java.util.*;
import java.util.PriorityQueue;

public class Solution{
    public static void kLargest(int nums[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
             if(pq.size()>k){
            pq.remove();
        }
        }
       
        int result = pq.peek();
        System.out.println("the answer is -> "+result);
    }
    // brute force aroach

    public static void bruteforce(int nums[],int k){
        int n = nums.length;
        Arrays.sort(nums);
        int result = nums[n-k];
        System.out.println("the answer through the brute force is -> "+result);

    }
    public static void main(String args[]){
        int nums[] = {12,34,56,76,32,1};
        int k =3;
        kLargest(nums,k);
        bruteforce(nums,k);
    }
}