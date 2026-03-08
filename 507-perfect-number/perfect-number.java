class Solution {
    public boolean checkPerfectNumber(int num) {
        boolean ans = false;
        int sum = 0;
        for(int i = 1;i < num;i ++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        return sum==num;
    }
}