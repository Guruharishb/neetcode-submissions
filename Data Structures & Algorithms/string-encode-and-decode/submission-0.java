class Solution {

    public String encode(List<String> strs) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            String s=strs.get(i);

            st.append(s.length()+"#"+s);
        }
        return st.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int length = 0;

        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            length = length * 10 + (str.charAt(i) - '0');
            i++;
        }
        i++;
        String s = str.substring(i, i + length);
        result.add(s);
        i += length;
    }

    return result;
    }
}
