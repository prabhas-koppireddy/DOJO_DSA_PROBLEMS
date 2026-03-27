class Solution {

    public static int fun(int[] arr, int n, int mid){
        int value = 1, maxSum = 0;
        for(int i = 0;i < n;i ++){
            if(arr[i] + maxSum <= mid){
                maxSum += arr[i];
            }
            else{
                value += 1;
                maxSum = arr[i];
            }
        }
        return value;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i = 0;i < n;i ++){
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }
        int low = max, high = sum, ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(fun(nums, n, mid) <= k){
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