class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> mapS = new HashMap<>() ;
        Map<String, Integer> mapT = new HashMap<>() ;
        // hashmap with containsKey(), equals(), get()
        // String[] sArr = s.toCharArray();
        for (int i = 0 ; i < s.length(); i ++)
        {
            String str = String.valueOf(s.charAt(i)) ;
            if(mapS.containsKey(str)){
                mapS.put(str, mapS.get(str) + 1);
            }
            else{mapS.put(str , 1);}
            
        }

        for (int i = 0 ; i < t.length(); i ++)
        {
            String str = String.valueOf(t.charAt(i)) ;
            if(mapT.containsKey(str)){
                mapT.put(str, mapT.get(str) + 1);
            }
            else{mapT.put(str , 1);}
            
        }
        return mapS.equals(mapT); 
    }
}
