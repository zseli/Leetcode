//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
class BuyAndSellStock1 {
    public static void main(String[] args) {
        int[] prices ={7,1,5,3,6,4};
        System.out.println("Result="+ maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        int min=prices[0],max=0;
        for(int price:prices){
            min = Math.min(min, price);
            max = Math.max(max, price-min);
        }
        return max;
    }
}
