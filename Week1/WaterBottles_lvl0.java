class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {        
        int drunk=numBottles+numBottles/numExchange;
        int extra=numBottles/numExchange+(numBottles%numExchange);
        while(extra>=numExchange) {
            drunk+=extra/numExchange;
            extra=extra/numExchange+(extra%numExchange);
        }
        return drunk;
    }    
}
