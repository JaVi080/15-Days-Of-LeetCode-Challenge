class Solution {
    public int maxProfit(int[] prices) {
               int maxProf=0;
        int min=prices[0];
   for(int num:prices){
   min=Math.min(min,num);
   maxProf=Math.max(maxProf,num-min);
      }
        return maxProf;
    }
}