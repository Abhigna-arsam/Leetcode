class Solution {
    public String destCity(List<List<String>> paths) {
         Set<String> st = new HashSet<>();
        
        for(List<String> path : paths) {
            String s = path.get(0);
            st.add(s);
        }
        
        for(List<String> path : paths) {
            String d = path.get(1);
            
            if(!st.contains(d)) {
                return d;
            }
        }
        
        return "";
    }
}