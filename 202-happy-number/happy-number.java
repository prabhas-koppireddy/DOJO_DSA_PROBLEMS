class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int rem = 0;
        while(n != 1 && !set.contains(n)){
            set.add(n);
            int sumSquares = 0;
            while(n > 0){
                rem = n % 10;
                n = n / 10;
                sumSquares = sumSquares + (rem * rem);
            }
            n = sumSquares;
        }
        return n == 1;
    }
}