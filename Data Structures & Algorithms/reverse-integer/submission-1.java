class Solution {
    public int reverse(int x) {
        int ans =0;
        int MAX= 2147483647;
        while(x!=0){
        int lastDigit = x%10;
        x = x/10;
         if((ans > MAX/10) || (ans == MAX/10 && lastDigit > 7)){
            return 0;
        }
        if(ans < Integer.MIN_VALUE / 10 || 
              (ans == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }
        ans = ans*10 + lastDigit;
       
        }
            return ans;
        



        
        
    }
    
}
