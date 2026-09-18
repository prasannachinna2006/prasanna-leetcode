class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length-k;
    
        ArrayList<Integer>List=new ArrayList<>();
        for(int i=n;i<nums.length;i++){
            List.add(nums[i]);
        

        }
        for(int j=0;j<n;j++){
            List.add(nums[j]);
        
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=List.get(i);
        }
        
    }
}