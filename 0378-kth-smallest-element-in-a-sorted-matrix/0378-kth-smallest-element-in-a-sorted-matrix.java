class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> add = new ArrayList<>();
        int n = matrix.length;
        for(int i = 0;i < n;i++){
            for (int j = 0;j<n;j++){
                add.add(matrix[i][j]);
            }
        }
        
        Collections.sort(add);

        int ans = add.get(k-1);
        return ans;
    }
}