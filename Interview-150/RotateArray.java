class RotateArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        rotate(nums, 3);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    public static void rotate(int[] nums, int k){
        if(k>nums.length) 
            k = k%nums.length;
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
    }
    public static void reverseArray(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
}
