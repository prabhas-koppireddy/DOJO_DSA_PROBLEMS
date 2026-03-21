class Solution {

    public static int timeTaken(int[] piles, int hours){
        int n = piles.length;
        int totalHours = 0;
        for(int i = 0;i < n;i ++){
            totalHours += Math.ceil((double)piles[i]/hours);
        }
        return totalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length, max = Integer.MIN_VALUE;
        for(int i = 0;i < n;i ++){
            max = Math.max(max, piles[i]);
        }
        int low = 1, high = max;
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(timeTaken(piles, mid) <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}

// Brute-Force Code
class Solution {

    public static int timeTaken(int[] piles, int hours){
        int n = piles.length;
        int totalHours = 0;
        for(int i = 0;i < n;i ++){
            totalHours += Math.ceil((double)piles[i]/hours);
        }
        return totalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length, max = Integer.MIN_VALUE;
        for(int i = 0;i < n;i ++){
            max = Math.max(max, piles[i]);
        }
        for(int i = 1;i <= max;i ++){
            int reqTime = timeTaken(piles, i);
            if(reqTime <= h){
                return i;
            }
        }
        return -1;
    }
}
