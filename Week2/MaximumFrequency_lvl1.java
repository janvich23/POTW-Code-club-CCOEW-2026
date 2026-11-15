import java.util.Hashtable;
import java.util.Map;
class MaximumFrequency_lvl1 {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length,val=0;
        Hashtable<Integer,Integer> table=new Hashtable<>();
        for(int i=0;i<n;i++) {
            if(!table.containsKey(nums[i])) table.put(nums[i],1);
            else {
                val=table.get(nums[i])+1;
                table.put(nums[i],val);
            }
        }
        int max=0;
        for(Integer freq:table.values()) {
            if(freq>max) max=freq;
        }
        val=0;
        for(Integer freq:table.values()) {
            if(freq==max) val++;
        }
        return val*max;
    }
}
