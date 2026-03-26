class Solution {

    public static boolean fun(int[] arr, int n, int m, int k, int days){
        int count = 0, noOfB = 0;
        for(int i = 0;i < n;i ++){
            if(arr[i] <= days){
                count++;
            }
            else{
                noOfB += (count / k);
                count = 0;
            }
        }
        noOfB += (count / k);
        return noOfB >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long)m * k > n) return -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i = 0;i < n;i ++) {
			min = Math.min(min, bloomDay[i]);
			max = Math.max(max, bloomDay[i]);
		}
        int low = min, high = max, ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(fun(bloomDay, n, m, k, mid) == true){
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