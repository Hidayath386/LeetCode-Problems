class Solution {
    public int[] buildArray(int[] nums) {
        int[] newarr= new int[nums.length];
        for(int i=0;i<newarr.length;i++)
        {
            newarr[i]=nums[nums[i]];
        }
        return newarr;
    }
}