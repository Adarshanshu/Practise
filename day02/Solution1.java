package day02;
class Solution1{
    public static void product(int nums[]){
        int answer[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int ans =1;
            for(int j=i;j<nums.length;j++){
                if(i!=j){
                    ans *= nums[j];
                }
            }
            answer[i] = ans;
        }
        //System.out.println()
        for(int i=0;i<nums.length;i++){
            System.out.print(answer[i]+" ");
        }
        
    }
    public static void optimal(int nums[]){
        int answer[] = new int[nums.length];
        int  n = nums.length;
        answer[0] =1;
        for(int i=1;i<n;i++){
            answer[i] = answer[i-1]*nums[i-1];
        }
        int suffix =1;

        for(int i=n-1;i>=0;i--){
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(answer[i]+" ");
        }
    }
    public static void main(String arggs[]){
        int nums[] = {2,4,5,6,2,3};
       // product(nums);
       optimal(nums);
    }
}