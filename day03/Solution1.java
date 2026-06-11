package day03;

import java.util.Arrays;

import java.util.ArrayList;

public class Solution1 {
    public static int[] separate(int nums[]){
        ArrayList<Integer> list = new ArrayList<>();
       for(int num : nums){
        String str = String.valueOf(num);
         for(int i=0;i<str.length();i++){
            list.add(str.charAt(i)-'0');
         }
        }
         int ans[] = new int[list.size()];
         for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
         }
       
       return ans;
      
    }
    public static void main(String args[]){
        int nums[] = {123,45,34,67,34,11};
        int result[] = separate(nums);
       System.out.print(Arrays.toString(result));
    }
}
