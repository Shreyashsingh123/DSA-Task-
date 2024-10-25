class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
         if(nums.length==1){
                ans=nums.length-nums[0];
                return ans;
            }
        for(int i=0;i<nums.length-1;i++){
            // if(nums.length==1){
            //     ans=nums.length-nums[0];
            //     return ans;
            // }
          if(nums[nums.length-1]-nums.length!=0){
            ans=nums.length;
            return ans;
          }
if(nums[i+1]-nums[i]==1) continue;
else{
    ans=nums[i+1]-1;
}
        }
        return ans;

    }
}
