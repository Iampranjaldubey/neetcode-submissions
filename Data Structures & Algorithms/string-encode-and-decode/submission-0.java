class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String s: strs){
            encoded.append(s.length()).append("#").append(s);

        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> result= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+len+1);
            result.add(word);
            i=j+len+1;
        }
        return result;

    }
}
