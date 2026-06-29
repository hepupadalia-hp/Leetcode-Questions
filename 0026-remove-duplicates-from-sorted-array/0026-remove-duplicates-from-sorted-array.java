class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        for(int x=0;x<nums.length-1;x++) {
            if(nums[x]!=nums[x+1]){
            nums[i]=nums[x];
            i++;
           }
        }
        nums[i]=nums[nums.length-1];
        i++;
        return i;
    }
}