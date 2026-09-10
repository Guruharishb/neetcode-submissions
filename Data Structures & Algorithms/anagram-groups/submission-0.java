class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] srt=strs[i].toCharArray();
            Arrays.sort(srt);
            String st = new String(srt);
          
            if(map.containsKey(st)){
                map.get(st).add(strs[i]);
            }
            else{
                map.put(st,new ArrayList<>());
                map.get(st).add(strs[i]);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> s:map.values()){
            ans.add(s);
        }
        return ans;
    }
}
