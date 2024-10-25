class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int ans[]=new int[nums.length];
       int j=0;
       int y=1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            if(j%2==0){
            ans[j]=nums[i];
            j+=2;
        }
       
        }
       } 
        for(int i=0;i<nums.length;i++){
        if(nums[i]%2!=0){
            if(y%2!=0){
            ans[y]=nums[i];
            y+=2;
        }
       
        }
       } 
       return ans;
    }
}
