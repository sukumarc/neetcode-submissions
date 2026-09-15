class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroup = new HashMap<>();

        for(String s: strs) {
            int count[] = new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }           
            String sorted =  Arrays.toString(count);

            anagramGroup.putIfAbsent(sorted, new ArrayList<>());
            
            anagramGroup.get(sorted).add(s);

        }

       return new ArrayList<>( anagramGroup.values());
        
        
    }
}
