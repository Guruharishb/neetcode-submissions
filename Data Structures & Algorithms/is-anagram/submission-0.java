class Solution {
    public boolean isAnagram(String s, String t) {
        int frq[]=new int[26];
        for(char c: t.toCharArray()){
            frq[c-'a']++;
        }
        for(char c: s.toCharArray()){
            frq[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(frq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
