class Solution 
{
    public int maxAscendingSum(int[] nums) 
    {
        int max = nums[0];
        int curr = max;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] <= nums[i - 1])
                curr = nums[i];
            else
            {
                curr += nums[i];
                if(curr > max)
                    max = curr;
            }
        }
        
        return max;
    }
}