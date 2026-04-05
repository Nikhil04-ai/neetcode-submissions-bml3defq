class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int left = 0;
        int [] result = new int [n - k + 1];
        
        for(int right =0; right< nums.length ; right ++){

            if(!dq.isEmpty() && dq.peekFirst() == right - k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[right]){
                dq.pollLast();
            }

            dq.offerLast(right);

            if(right>= k -1 ){
                result[right - k + 1] = nums[dq.peekFirst()];
            }


        }
        return result;
        
    }
}
