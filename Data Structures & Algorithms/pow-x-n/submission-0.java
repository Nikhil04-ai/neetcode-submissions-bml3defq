class Solution {
    public double myPow(double x, int n) {
        long power = n;

        if(power< 0){
            x=1/x;
            power=-power;
        }
        return Power(x , power);

        
        
        
    }
    public double Power(double x , long n){
        if(n==0){
            return 1 ;
        }
        double half = Power(x , n/2);

        if(n%2==0){
            return half*half;
        }else{
            return x* half * half;
        }
    }
}
