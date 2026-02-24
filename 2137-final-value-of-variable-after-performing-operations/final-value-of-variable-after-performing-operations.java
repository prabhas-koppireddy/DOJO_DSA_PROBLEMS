class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int n = operations.length, count = 0;
       for(int i = 0;i < n;i ++){
        if(operations[i].equals("X++") || operations[i].equals("++X")){
            count = count + 1;
        }
        else{
            count = count - 1;
        }
       }
       return count;
    }
}