class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans=i;
                break;
            }
            if(nums[i]!=target){
                if(nums[i]>target){
                    ans=i;
                    break;
                }
                if(nums[nums.length-1]<target){
                    ans=nums.length;
                    break;
                }
            }

        }
        // if(nums.length==1){
        //     ans+=1;
        //     break;
        // }
        return ans;
    }
}
