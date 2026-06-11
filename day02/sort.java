package day02;
public class sort {
    public static void sorting(int nums[]){
        int count1=0,count2=0,count3=0;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count1++;
            }
           else if(nums[i]==1){
                count2++;
            }
            else{
                count3++;
            }
        }
        for(int i=0;i<count1;i++){
            nums[idx++] = 0;
        }
        for(int i=0;i<count2;i++){
            nums[idx++] = 1;
        }
        for(int i=0;i<count3;i++){
            nums[idx++] = 2;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    //now i will sort the numbers in more optimized way
    public static void swap(int nums[],int a,int b){
        int temp = nums[a];
        nums[a]= nums[b];
        nums[b] = temp;
    }
    public static void optimal(int nums[]){
        int low =0;
        int mid =0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,0,0,1,0,2,1,2,1,0,0};
       // sorting(nums);
        optimal(nums);
    }
}
