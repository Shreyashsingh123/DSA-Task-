class Solution {
    public int majorityElement(int[] nums) {
        int j=0;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            if(j==0){
               ans=nums[i]; 
            }
            if(nums[i]==ans){
                j++;
            }
            else{
                j--;
            }
           

        }
        return ans;
    }
}
