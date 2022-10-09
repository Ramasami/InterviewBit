public class Solution {
    public int solve(ArrayList<Integer> a, int b) {
        int sum = 0;
        int n = a.size();
        for(int i=0;i<b;i++) {
            sum+=a.get(i);
        }
        int r = n-1;
        int l = b-1;
        int maxSum = sum;
        for(int i=0;i<b;i++) {
            sum+=(a.get(r)-a.get(l));
            r--;
            l--;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
