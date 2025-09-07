import java.util.*;
class TwoSum{
    public int[] twoSum(int[]nums,int target){
        Map<Integer,Integer> res= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int s= target-nums[i];
            if(res.containsKey(s)){
                return new int[]{res.get(s),i};
            }
            res.put(nums[i],i);
        }
        return new int[]{};
    }
}