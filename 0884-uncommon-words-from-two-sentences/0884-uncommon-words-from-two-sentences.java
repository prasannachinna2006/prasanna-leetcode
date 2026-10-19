class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String>list=new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        String[] words=s1.split(" ");
        String[] words2=s2.split(" ");
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(int j=0;j<words2.length;j++){
            map.put(words2[j],map.getOrDefault(words2[j],0)+1);
        }
        for(String w:map.keySet()){
            if(map.get(w)==1){
                list.add(w);
            }
        }
        return list.toArray(new String[list.size()]);

        
    }
}