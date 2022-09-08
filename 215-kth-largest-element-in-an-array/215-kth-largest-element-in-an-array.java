class Solution {
    public int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            return arr[arr.length-k];
        }
        return -1;
    }
}