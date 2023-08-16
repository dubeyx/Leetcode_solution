class Solution {
   public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekLast() < nums[i]) {
                dq.removeLast();
            }
            dq.add(nums[i]);
            if (i >= k - 1) {
                l.add(dq.peekFirst());
                // remove first
                if (!dq.isEmpty() && dq.peekFirst() == nums[i - k + 1]) {
                    dq.removeFirst();
                }
            }
        }
        int[] ans = new int[l.size()];
        int j = 0;
        for (Integer i : l) {
            ans[j++] = i;
        }
        return ans;
    }
}