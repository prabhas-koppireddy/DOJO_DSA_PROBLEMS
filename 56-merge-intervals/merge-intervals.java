class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
       int n = intervals.length;
       ArrayList<int[]> list = new ArrayList<>();
       int i = 0;
       while(i < n){
        int first = intervals[i][0];
        int second = intervals[i][1];
        int j = i + 1;
        while(j < n && second >= intervals[j][0]){
            second = Math.max(second, intervals[j][1]);
            j++;
        }
        list.add(new int[]{first, second});
        i = j;
       }
       return list.toArray(new int[list.size()][]);
    }
}