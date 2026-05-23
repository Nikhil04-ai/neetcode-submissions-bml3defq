class Solution {
    public int getSum(int a, int b) {
        
        int sum =0;

        while(b!=0) {
            sum = a^b;
            int carry = (a&b)<<1;
            b=carry;
            a=sum;
        }

        return a;
        
    }
}
