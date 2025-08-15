class RemoveDuplicateFromArray1 {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,2,3,3,4,4};
        System.out.println("Size: "+ removeDuplicate(nums));
        for(int num: nums){
            System.out.print(num);
        }
    }
    public static int removeDuplicate(int[] nums){
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}
