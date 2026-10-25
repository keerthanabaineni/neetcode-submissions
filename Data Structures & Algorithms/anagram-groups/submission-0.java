class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<>();
        boolean[] visited=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i]){
                continue;
            }
            char[] ch1=strs[i].toCharArray();
            Arrays.sort(ch1);
            List<String> list= new ArrayList<>();
            list.add(strs[i]);
            visited[i]= true;
            for(int j=i+1;j<strs.length;j++){
                char[] ch2=strs[j].toCharArray();
                Arrays.sort(ch2);
                if(Arrays.equals(ch1,ch2)){
                    list.add(strs[j]);
                visited[j]=true;
                }
            }
            res.add(list);
        }
        return res;
        
    }
}
