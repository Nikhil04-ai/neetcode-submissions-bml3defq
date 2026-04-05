class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans , "" , 0 , 0 , n);
        return ans;
        
    }
    private void solve(List<String> ans , String curr , int opening , int closing , int n) {
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }

        if(opening < n){
            solve(ans , curr + "(" , opening +1 , closing , n);
        }

        if(closing < opening){
            solve(ans , curr + ")" , opening , closing +1 , n );
            
        }
    }
}
