class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;

        int c = a + b;

        int[] ans = new int[c];

        for(int i = 0;i < a;i++){
            ans[i] = nums1[i];
        }
        for(int i = 0;i < b;i++){
            ans[a + i] = nums2[i];
        }

        Arrays.sort(ans);
        

        double median = 0;

        int length = ans.length;

        if(length % 2 == 0){
            int sumof = ans[length / 2] + ans[length / 2 - 1];

            median = ((double) sumof) /2;
        }
        else{
            median = (double) ans[length/2];
        }
        return median;
    }
}