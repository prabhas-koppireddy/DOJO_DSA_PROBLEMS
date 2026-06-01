class Solution {

    private int atMost(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }

        int l = 0;
        int countOdd = 0;
        int cnt = 0;

        for (int r = 0; r < nums.length; r++) {

            if (nums[r] % 2 != 0) {
                countOdd++;
            }

            while (countOdd > k) {
                if (nums[l] % 2 != 0) {
                    countOdd--;
                }
                l++;
            }

            cnt += (r - l + 1);
        }

        return cnt;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
}