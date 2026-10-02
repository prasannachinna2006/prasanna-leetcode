class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        char[] ch=s.toCharArray();
        for(char i:ch){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
        
    }
}