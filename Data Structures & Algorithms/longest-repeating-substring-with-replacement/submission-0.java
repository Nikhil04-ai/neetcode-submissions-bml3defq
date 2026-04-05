class Solution {
    public int characterReplacement(String s, int k) {
        
       int[] freq = new int [26];
       int max_freq =0;
       int left=0;
       int max_len=0;

       for(int right=0; right<s.length() ; right++){
            freq[s.charAt(right)-'A']++;

            max_freq = Math.max(max_freq , freq[s.charAt(right) - 'A']);

            while((right - left + 1) - max_freq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            max_len = Math.max(max_len , right - left + 1);


       }
       return max_len;

       
    }
}
