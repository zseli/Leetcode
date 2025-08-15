// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
class RemoveDuplicateFromArray2 {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,2,3,3,4,4};
        System.out.println("Size: "+ removeDuplicate(nums));
        for(int num: nums){
            System.out.print(num);
        }
    }
    public static int removeDuplicate(int[] nums){
        int j=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[j-2]){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}
