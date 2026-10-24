class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        int[] freq = new int[nums.length];
        boolean[] visited= new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            int count=1;

            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    visited[j]=true;

                }
            }
            freq[i]= count;
        }
        for(int i=0;i<k;i++){
            int max=-1;
            int index=-1;
            for(int j=0;j<nums.length;j++){
                if(!visited[j] && freq[j]>max){
                    max=freq[j];
                    index =j;
                }
            }
            res[i] = nums[index];
            visited[index] = true;
        }
        return res;
    }
}
