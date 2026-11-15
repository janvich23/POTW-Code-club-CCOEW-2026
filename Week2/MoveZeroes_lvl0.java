class MoveZeroes_lvl0 {
    public void moveZeroes(int[] nums) {
        int n=nums.length,zeroptr=0,numptr=0;
        for(int i=0;i<n;i++) {
            if(nums[i]==0) { 
                zeroptr=i;
                for(int j=i;j<n;j++) { 
                    if(nums[j]!=0) {
                        numptr=j;
                        break;
                    }
                }
                if(numptr>0) {
                    for(int j=0;j<n-numptr;j++) {
                        nums[zeroptr]=nums[numptr];
                        nums[numptr]=0;
                        zeroptr++;
                        numptr++;
                    }
                }
            }
        }
    }
}
