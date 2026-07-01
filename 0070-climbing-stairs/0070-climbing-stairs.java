class Solution {
    public int climbStairs(int n) {
        if(n <=2)
        {
            return n;
        }
        int first = 1; int secc = 1;
        for(int i = 2; i <= n; i++)
        {
            int temp = secc;
            secc = secc + first;
            first = temp;
        }
        return secc;
    }
}