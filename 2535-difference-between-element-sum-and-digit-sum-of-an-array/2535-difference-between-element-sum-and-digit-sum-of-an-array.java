class Solution {
    public int differenceOfSum(int[] nums) {
        int e_sum=0;
        int d_sum=0;
        for(int i=0;i<nums.length;i++){
            e_sum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]<9){
                d_sum+=nums[j];
            }
            else{
                String str=String.valueOf(nums[j]);
                for(int k=0;k<str.length();k++){
                d_sum+=str.charAt(k)-'0';
                }
            }
        }
        return Math.abs(e_sum-d_sum);
        
    }
}