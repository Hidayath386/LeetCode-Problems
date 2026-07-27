class Solution {
    public int[] buildArray(int[] nums) {
        int[] numss=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            numss[i]=nums[nums[i]];
        }
        return numss;
        
    }
}