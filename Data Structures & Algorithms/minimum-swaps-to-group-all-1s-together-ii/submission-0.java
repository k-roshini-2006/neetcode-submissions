class Solution {
    public int minSwaps(int[] nums) {
        int ones=0;
        int zero=0;
        for(int i:nums){
            if(i==1){
                ones++;
            }
        }
        int n=nums.length;
        if(ones==0 || ones==n){
            return 0;
        }
        int left=0,minSwap=Integer.MAX_VALUE;
        for(int right=0;right<ones+n-1;right++){
            if(nums[right % n]==0){
                zero++;
            }
            if(right-left+1>ones){
                if(nums[left % n]==0){
                    zero--;
                }
                left++;
            }
            if(right-left+1==ones){
                minSwap=Math.min(minSwap,zero);
            }
        }
        return minSwap;
    }
}
