//https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150
class JumpGame1{
    public static void main(String[] args) {
        int[] jumps = {3,2,1,0,4};
        System.out.println("Can jump="+canJump(jumps));
    }
    public static boolean canJump(int[] nums){
        int maxJumps=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i>maxJumps){
                return false;
            }
            else if(maxJumps>=nums.length){
                return true;
            }
            maxJumps = Math.max(maxJumps, i+nums[i]);
        }
        return true;
    }
}