class Solution {
    public boolean checkIfExist(int[] arr) { 
        int half=0,flag=0;
        Arrays.sort(arr);      
        for(int i=0;i<arr.length;i++) {
            flag=0;
            if(arr[i]%2==0) {
                half=arr[i]/2;
                if(arr[i]<0) flag++;
            }
            else continue;
            if(flag>0) {
                for(int j=i+1;j<arr.length;j++) {
                    if(arr[j]==half) return true;
                    if(arr[j]>0) break;
                }
            }
            else {
                for(int j=i-1;j>=0;j--) {
                    if(arr[j]==half) return true;
                    if(arr[j]<0) break;
                }
            }
        }
        return false;       
    }
}
