class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int a=j+1;
                    while(a<nums2.length){
                    if(nums1[i]<nums2[a]){
                        list.add(nums2[a]);
                        break;
                        
                    }
                    a++;
                    }
                    if(a==nums2.length){
                        list.add(-1);
                    }
                    break;
                }
            }
        }
        int [] ans=new int[list.size()];
        for(int k=0;k<list.size();k++){
            ans[k]=list.get(k);
        }
        
        return ans;
    
    }
}