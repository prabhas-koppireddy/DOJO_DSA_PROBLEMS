class Solution {

    public static int fun(int[] weights, int value){
        int load = 0, days = 1;
        for(int i = 0;i < weights.length;i ++){
            if(load + weights[i] > value){
                days = days + 1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = Integer.MIN_VALUE, sum = 0, ans = 0;
        for(int i = 0;i < n;i ++){
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }
        int low = max, high = sum;
        while(low <= high){
            int mid = (low + high)/2;
            int reqWeight = fun(weights, mid);
            if(reqWeight <= days){
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