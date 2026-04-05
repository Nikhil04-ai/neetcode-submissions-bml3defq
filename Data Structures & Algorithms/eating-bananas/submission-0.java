class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 ;
        int high = 0;
         
         for(int i : piles ){
            high = Math.max(high , i);

         }

         while(low< high){
            int mid= low + (high - low)/2;

            int total_hours = 0;
            for(int p :piles){
                total_hours += (p + mid -1)/mid;
            }
            if(total_hours <= h){
                    high = mid;

                }else{
                    low = mid + 1;
                }
         }
         return low;
    }
}
