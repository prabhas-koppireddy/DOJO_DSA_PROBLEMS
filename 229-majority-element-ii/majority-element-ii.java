class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        int el1 = 0, cnt1 = 0, el2 = 0, cnt2 = 0;
        for(int i = 0;i < n;i ++){
            if(cnt1 == 0 && nums[i] != el2){
                el1 = nums[i];
                cnt1++;
            }
            else if(cnt2 == 0 && nums[i] != el1){
                el2 = nums[i];
                cnt2++;
            }
            else if(nums[i] == el1) cnt1++;
            else if(nums[i] == el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        int count1 = 0, count2 = 0;
        for(int i = 0;i < n;i ++){
            if(nums[i] == el1) count1++;
            else if(nums[i] == el2) count2++;
        }
        int min = (n/3) + 1;
        if(count1 >= min) list.add(el1);
        if(count2 >= min) list.add(el2);
        return list;
    }
}