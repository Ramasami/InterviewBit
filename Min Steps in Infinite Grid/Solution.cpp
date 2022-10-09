int Solution::coverPoints(vector<int> &a, vector<int> &b) {
    int steps = 0;
    int n = a.size();
    for (int i=0;i<n-1;i++) {
        steps += max(abs(a[i]-a[i+1]), abs(b[i]-b[i+1]));
    }
    return steps;
}
