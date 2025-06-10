class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> mp = new HashMap<>();
        
        for(List<String> p : paths) {
            String s = p.get(0); 
            mp.put(s, mp.getOrDefault(s, 0) + 1);
        }
        
        for(List<String> p : paths) {
            String d = p.get(1);
            
            if(mp.getOrDefault(d, 0) == 0) {
                return d;
            }
        }
        
        return "";
    }
}