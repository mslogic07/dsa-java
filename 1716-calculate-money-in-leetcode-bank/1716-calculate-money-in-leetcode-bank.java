class Solution {
    public int totalMoney(int n) {
        int weekCnt = 0;
            int cntDay = 1;
            int total = 0;
            while(n>0){
                if((cntDay -weekCnt)% 8 == 0){
                    weekCnt++;
                    cntDay = weekCnt + 1;
                }
                total += cntDay;
                cntDay++;
                n--;
            }
            return total;
    }
}