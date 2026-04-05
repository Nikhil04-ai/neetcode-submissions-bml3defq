class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int i, int[] arr, List<Integer> temp, int target) {
        
        if (target == 0) {
            ans.add(new ArrayList<>(temp)); 
            return;
        }

      
        if (i == arr.length || target < 0) {
            return;
        }

      
        solve(i + 1, arr, temp, target);

        
        temp.add(arr[i]);
        solve(i, arr, temp, target - arr[i]); 
        temp.remove(temp.size() - 1); 
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ans.clear();
        solve(0, nums, new ArrayList<>(), target);
        return ans;
    }
}