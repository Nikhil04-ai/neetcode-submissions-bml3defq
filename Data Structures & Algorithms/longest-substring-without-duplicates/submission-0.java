class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left =0;
        int maxCount =0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
                            }
            set.add(c);
            maxCount = Math.max(i - left +1, maxCount);

            
                        
        }
        return maxCount;
    }
}
