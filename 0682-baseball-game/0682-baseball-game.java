class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                int c=stack.peek();
                stack.push(c*2);
            }
            else if(operations[i].equals("+")){
                int z=stack.pop();
                int y=stack.peek();
                stack.push(z);
                stack.push(y+z);
            }
            else{
                int a=Integer.parseInt(operations[i]);
                stack.push(a);
            }
        }
        int sum=0;
        for(int p:stack){
            sum+=p;
        }
        return sum;
        
    }
}