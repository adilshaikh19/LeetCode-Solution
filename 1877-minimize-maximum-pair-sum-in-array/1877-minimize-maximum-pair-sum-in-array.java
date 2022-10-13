class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = -1;
        for(int i = 0; i<n;i++){
            res = Math.max(res, nums[i] + nums[n - 1 -i]);
        }
        return res;
    }
}