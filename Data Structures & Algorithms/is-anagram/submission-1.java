class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int [] arr = new int[26];
        for(int i=0;i<s.length();i++){
            int num = s.charAt(i) -'a';
            arr[num]++;
        }

        for(int i=0;i<t.length();i++){
            if(arr[ t.charAt(i) -'a']>=1){
                arr[ t.charAt(i) -'a']--;
            }
        }

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=1){
                return false;
            }
        }
        return true;

    }  

}
