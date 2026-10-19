class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);

        }
        int count=0;
        for(int j=0;j<jewels.length();j++){
            if(map.containsKey(jewels.charAt(j))){
                count=count+map.get(jewels.charAt(j));
            }
        }
        return count;
        
        
    }
}