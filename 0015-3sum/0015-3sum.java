/*class Solution {
    public int[] threeSum(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==target)
                    {
                        return new int[] {i,j,k};
                    }
                }
            }
            
        }
        reuturn new int[] {};
        
    }
}*/
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);                         // sort first
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])   // skip duplicate first elements
                continue;

            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // skip duplicates for left and right
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;                         // need a larger sum
                } else {
                    right--;                        // need a smaller sum
                }
            }
        }
        return res;
    }
}
