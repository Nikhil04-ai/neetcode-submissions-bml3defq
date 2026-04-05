class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i : nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i) + 1 );
            }else{
                hm.put(i , 1);
            }
        }
        List<Integer> list = new ArrayList<>(hm.keySet());
        
        Collections.sort(list , new Comparator<Integer>(){
            public int compare(Integer a ,  Integer b){     
                return hm.get(b) - hm.get(a);
            }

            });

        int[] arr = new int[k];
        for (int i=0;i<k;i++){
            arr[i] = list.get(i);
            
        } 
        return arr;   

        
    }
}
