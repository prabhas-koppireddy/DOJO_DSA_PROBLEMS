class Solution {
    //function
    public static int Divisor(int[] arr, int value, int n){
        int smallDivisor = 0;
        for(int i = 0;i < n;i ++){
            smallDivisor += Math.ceil((double)arr[i]/value);
        }
        return smallDivisor;
    }
    //Main Function
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < n;i ++){
            max = Math.max(max, nums[i]);
        }
        int low = 1, high = max, ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(Divisor(nums, mid, n) <= threshold){
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