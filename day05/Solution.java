package day05;

import java.util.Arrays;

public class Solution {

    // we will try to solve the two sum problem using two pointer aproach

    // to apply two pointer aproach the array should be sorted . 

    public static int[] twoSum(int nums[],int target){
        int left =0;
        int right =nums.length-1;
        //int ans[] = new int[2];
        Arrays.sort(nums);
        while(left<right){
            int sum =  nums[left] + nums[right];
            if(sum==target){
                return new int[]{nums[left],nums[right]};
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int nums[] = {12,34,2,36,8,7,3};
        int target = 9;
        int result[] = twoSum(nums,target);
        for(int i=0;i<2;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}
