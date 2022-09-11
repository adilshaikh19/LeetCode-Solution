class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0;i<operations.length;i++){
            if(Objects.equals(operations[i], "--X")){
                --x;
            }
            else if(Objects.equals(operations[i],"X++")){
                x++;
            }
            else if(Objects.equals(operations[i],"++X")){
                ++x;
            }
            else if(Objects.equals(operations[i],"X--")){
                x--;
            }
        }
        return x;
    }
}