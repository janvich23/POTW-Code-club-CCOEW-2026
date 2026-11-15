class PivotIndex_lvl1 {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        if(n==2) {
            if(nums[1]==0) return 0;
            if(nums[0]==0) return 1;            
        }
        int endsum=0;
        for(int i=1;i<n;i++) {
            endsum+=nums[i];
        }
        if(endsum==0) return 0;
        int end=1,startsum=0;
        for(int i=0;i<n-1;i++) {
            startsum+=nums[i];
            endsum-=nums[end];            
            end++;
            if(startsum==endsum) return i+1;
        }
        return -1;
    }
}
