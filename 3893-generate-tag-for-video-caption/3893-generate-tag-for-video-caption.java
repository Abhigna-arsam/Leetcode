class Solution {
    public String generateTag(String caption) {
        if (caption == null || caption.isEmpty()) return "#";

        String[] words = caption.trim().split("\\s+");
        StringBuilder tag = new StringBuilder("#");

        for (int i = 0; i < words.length; i++) {
            String word = words[i].replaceAll("[^a-zA-Z]", ""); // Remove non-letters from each word
            if (word.isEmpty()) continue;

            if (i == 0) {
                tag.append(word.toLowerCase());
            } else {
                tag.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    tag.append(word.substring(1).toLowerCase());
                }
            }
        }

 
        String finalT = tag.toString().charAt(0) + tag.toString().substring(1).replaceAll("[^a-zA-Z]", "");

       
        if (finalT.length() > 100) {
            finalT = finalT.substring(0, 100);
        }

        return finalT;
        
    }
}