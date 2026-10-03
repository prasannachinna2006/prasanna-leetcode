class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty()){
                if(stack.peek()==ch){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder str=new StringBuilder();
        for(char ch:stack){
            str.append(ch);
        }  
        return str.toString();      
    }
}