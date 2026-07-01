class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        if(n<0){
            return false;
        }
        else{
            int revNum = 0;
            while(n>0){
                int num = n%10;
                n/=10;
                revNum = revNum*10 + num;
            }
            if(revNum == x){
                return true;
            }
            else{
                return false;
            }
            
        }
    }
}