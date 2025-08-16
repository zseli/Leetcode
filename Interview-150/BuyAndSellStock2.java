//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/1737062882/?envType=study-plan-v2&envId=top-interview-150
class BuyAndSellStck2 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println("Profit="+findMaxProfit(prices));
    }
    public static int findMaxProfit(int[] prices){
        int total=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                total+=prices[i]-prices[i-1];
            }
        }
        return total;
    }
}
