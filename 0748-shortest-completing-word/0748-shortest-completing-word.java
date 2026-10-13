
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        String str = licensePlate.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        String num = "";

        for(int j = 0; j < words.length; j++) {
            HashMap<Character,Integer> temp = new HashMap<>(map);
            String word = words[j].toLowerCase();

            for(int k = 0; k < word.length(); k++) {
                if(temp.containsKey(word.charAt(k))) {
                    temp.put(word.charAt(k), temp.get(word.charAt(k)) - 1);

                    if(temp.get(word.charAt(k)) == 0) {
                        temp.remove(word.charAt(k));
                    }
                }
            }

            if(temp.isEmpty()) {
                if(num.equals("") || words[j].length() < num.length()) {
                    num = words[j];
                }
            }
        }

        return num;
    }
}
