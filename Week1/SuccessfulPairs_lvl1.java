class Solution {    
    int low,mid,high,least;
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length,m=potions.length;        
        int[] pairs=new int[n];        
        Arrays.sort(potions);
        for(int i=0;i<n;i++) {
            least=m;
            low=0;
            high=m-1;
            while(low<=high) {
                mid=(low+high)/2;
                if((long)spells[i]*potions[mid]>=success) {
                    least=mid;
                    high=mid-1;
                }                
                else low=mid+1;
            }
            pairs[i]=m-least;
        }
        return pairs;
    }
}
