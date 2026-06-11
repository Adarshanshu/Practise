package day02;
public class answer {

//     Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    public static void optimal(int nums1[],int m,int nums2[],int n){
        int i = m-1;
        int j= n-1;
        int k = m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        for(int l=0;l<nums1.length;l++){
            System.out.print(nums1[l]+" ");
        }
    }
    public static void main(String args[]){
        int nums1[] = {1,2,2,3,0,0,0};
        int nums2[] = {2,4,5};
        int m=4;
        int n= 3;
        optimal(nums1,m,nums2,n);
    }
}
