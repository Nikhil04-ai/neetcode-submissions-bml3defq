class Solution {
    public int missingNumber(int[] nums) {
        int rangeXor =0;
        for(int i=0; i<nums.length + 1 ; i++){
            rangeXor = rangeXor^i;
        
        }
        int arrXor=0;
        
        for(int num : nums){
            arrXor = arrXor^num;
        }

        int ans =  rangeXor^arrXor;
        return ans;
    }
}
