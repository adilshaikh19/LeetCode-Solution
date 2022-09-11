class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bool = new ArrayList<>();
        for(int i = 0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max(candies)){
                bool.add(true);
            }
            else {
                bool.add(false);
            }
        }
        return bool;
    }
    
    int max(int[] arr){
        int max = arr[0];
        for(int i = 0;i< arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}