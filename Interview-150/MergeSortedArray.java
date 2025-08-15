//https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
class MergeSortedArray{
    public static void main(String[] args){
        int[] nums1={2,4,6,0,0,0};
        int[] nums2={1,3,5};
        merge(nums1, 3,nums2,3);
        for(int num:nums1){
            System.out.print(num+ " ");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int p1=m-1, p2=n-1, i=n+m-1;
        while(p2>=0){
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[i--]=nums1[p1--];
            }else{
                nums1[i--]=nums2[p2--];
            }
        }
    }
}