//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
class RemoveElement {
    public static void main(String[] args) {
        int[] nums={3,2,4,5,2,3};
        int result= removeElement(nums, 3);
        System.out.println(result);
    }
    public static int removeElement(int[] nums, int val){
        int i=0, len=nums.length;
        while(i<len){
            if(nums[i]==val){
                nums[i]=nums[len-1];
                len--;
            }else{
                i++;
            }
        }
        return len;
    }
}
