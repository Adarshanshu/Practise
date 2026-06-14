package day04;

public class Solution{
    public static void product(int nums[]){
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int val = 1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    val  *= nums[j];
                }
            }
            arr[i] = val;
        }
    
        for(int i=0;i<nums.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void optimal(int nums[]){
        int n= nums.length;
        int ans[] = new int[n];
        ans[0] = 1;
        // we will find prefix of the array
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        // now we will calculate the suffix 
        int suffix =1;
        for(int i =n-1;i>=0;i--){
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String args[]){
        int nums[] = { 1,3,5,2,3};
        optimal(nums);
    }
}