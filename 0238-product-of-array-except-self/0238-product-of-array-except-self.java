class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int zeroCnt = 0;
        int prd = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                prd = prd * nums[i];
            }else{
                zeroCnt++;
            }
        }
        int[] ans = new int[nums.length];
        if(zeroCnt>0){
            if(zeroCnt>1){
                return ans;
            }else{
                for(int i = 0; i < nums.length; i++){
                    if(nums[i]==0){
                        ans[i] = prd;
                    }else{
                        ans[i] = 0;
                    }
                }
                return ans;
            }
        }else{
            for(int i = 0; i < nums.length; i++){
                ans[i] = prd/nums[i];
            }
            return ans;
        }
    }
}