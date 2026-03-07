class Solution {
    public int subtractProductAndSum(int n) {
        int rem = 0, sum = 0, prod = 1;
        while(n != 0){
            rem = n % 10;
            n = n / 10;
            sum = sum + rem;
            prod = prod * rem;
        }
        return prod - sum;
    }
}