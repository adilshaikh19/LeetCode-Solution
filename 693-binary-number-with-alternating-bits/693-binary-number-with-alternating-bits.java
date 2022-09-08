class Solution {
    public boolean hasAlternatingBits(int n) {
        while (n > 0){
            int last = n & 1;
            n = n >> 1;
            int slast = n & 1;
            if(last == slast){
                return false;
            }
        }
        return true;
    }
}