class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            
        }
        return gcd(min,max);
    }
    public static int gcd(int min,int max)
    {
        while(min!=0)
            {
                int temp=min;
                min=max%min;
                max=temp;
            }
        return max;
        }
    }
    
