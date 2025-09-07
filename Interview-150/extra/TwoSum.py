class Solution:
    def twoSum(self, nums :List[int], target:int)-> bool:
        seen={}
        for i, num in enumerate(nums):
            res= target-nums[i]
            if(res in seen):
                return [seen[res],i]
            seen[num]=i
        return[]