class Solution {
    public int addDigits(int num) {
        int rem=check(num);
        while(true) {
            if(rem<10) return rem;
            rem=check(rem);
        }
    }
    int check(int sum) {
        int rem=sum%10;
        sum=sum/10;
        while(sum>0) {
            rem+=sum%10;
            sum=sum/10;
        }
        return rem;
    }
}
