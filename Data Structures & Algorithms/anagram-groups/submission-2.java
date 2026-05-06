class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map= new HashMap<>();
        for(String x: strs){
            char[] a= x.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(x);
        }
        return new ArrayList<>(map.values());       
    }
}

