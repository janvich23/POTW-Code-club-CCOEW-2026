class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0,now=0;
        for(int i=0;i<nums.length;i++) {
            if(i==nums.length-1) {
                if(Math.abs(nums[i]-nums[0])>max) max=Math.abs(nums[i]-nums[0]);                
            }
            else {
                now=Math.abs(nums[i]-nums[i+1]);
                if(now>max) max=now;
            }
        }
        return max;
    }
}
