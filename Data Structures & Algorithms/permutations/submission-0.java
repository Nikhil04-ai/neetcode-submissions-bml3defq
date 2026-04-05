class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        generatePermutation(nums, result, visited, new ArrayList<>());
        return result;
    }

    public void generatePermutation(int[] nums, List<List<Integer>> result, boolean[] visited, List<Integer> current) {

        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (visited[i]) continue;

            visited[i] = true;
            current.add(nums[i]);

            generatePermutation(nums, result, visited, current);

            visited[i] = false;
            current.remove(current.size() - 1);
        }
    }
}