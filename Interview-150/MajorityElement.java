//https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class MajorityElement{
    public static void main(String[] args){
        int[] nums={2,2,1,1,1,2,2};
        //Approach1
        Arrays.sort(nums);
        System.out.println("Result="+nums[nums.length/2]);

        //Approach2
        int curr=0, count=0;
        for(int num:nums){
            if(count==0){
                curr=num;
            }
            count+= num==curr?1:-1;
        }
        System.out.println("Result="+curr);

        //Approach2
        Map<Integer,Integer> freqMap= new HashMap<>();
        for(int num:nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
            if(freqMap.get(num)>nums.length/2){
                System.out.println("Result="+num);
                break;
            }
        }
    }
}