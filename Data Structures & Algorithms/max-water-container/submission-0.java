class Solution {
    public int maxArea(int[] heights) {
        int start_pointer = 0;
        int end_pointer =heights.length -1;

        int max_cap=0;

        while(start_pointer < end_pointer){
            int height = Math.min(heights[start_pointer] , heights[end_pointer]);
            int curr = height*(end_pointer - start_pointer);

            if(max_cap<curr){
                max_cap = curr;
            }else if(heights[start_pointer]<heights[end_pointer]){
                start_pointer++;
            }else{
                end_pointer--;
            }
        }
        return max_cap;



    }
}
