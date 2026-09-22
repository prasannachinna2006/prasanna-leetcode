class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int pro_1=nums[0]*nums[1]*nums[n-1];
        int pro_2=nums[n-1]*nums[n-2]*nums[n-3];
        int max=Math.max(pro_1,pro_2);
        return max;
        
    }
}