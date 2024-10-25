class Solution {
    public int removeDuplicates(int[] nums) {
     int j=0;
    //  int ans[]=new int[nums.length];
     for(int i=0;i<nums.length;i++){
        if(nums[i]!=nums[j]){
            j++;
            nums[j]=nums[i];
        }
     }
     return j+1;
    }
}
