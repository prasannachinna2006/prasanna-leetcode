class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>stack1=new Stack<>();
        Stack<Character>stack2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                stack1.push(s.charAt(i));
            }
            else if(!stack1.isEmpty()){
                stack1.pop();
            }
        }
        for(int j=0;j<t.length();j++){
            if(t.charAt(j)!='#'){
                stack2.push(t.charAt(j));
            }
            else if(!stack2.isEmpty()){
                stack2.pop();
            }
        }
        if(stack1.equals(stack2)){
            return true;
        }
        return false;

        
    }
}