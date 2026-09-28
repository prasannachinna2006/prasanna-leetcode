class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] str=paragraph.toLowerCase().replaceAll("\\W+"," ").split("\\s+");
        HashMap<String,Integer>map=new HashMap<>();
        for(String i : str){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<banned.length;i++){
            map.remove(banned[i]);
        }
        int max=-1;
        String s=" ";
        for(String i :map.keySet()){
            if(max<map.get(i)){
                s=i;
                max=map.get(i);
            }
        }
        return s;
        
    }
}