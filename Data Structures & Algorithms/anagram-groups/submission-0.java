class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroup = new HashMap<>();

        for(String s: strs) {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String storted =  Arrays.toString(ch);

            if(anagramGroup.get(storted) == null){
            	List<String> groups = new ArrayList<>();
            	groups.add(s);
                anagramGroup.put(storted, groups);
            } else{
               List<String> groups = anagramGroup.get(storted);
               groups.add(s);
               anagramGroup.put(storted, groups);
            }

        }

       return  new ArrayList<>( anagramGroup.values());
        
        
    }
}
