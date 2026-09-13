class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        int result=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            pro=pro*digit;
            n=n/10;
        }
        result=pro-sum;
        return result;
        
        
    }
}