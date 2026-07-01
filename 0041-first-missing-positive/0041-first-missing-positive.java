class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>() ; 

        for(int i = 0 ; i < nums.length ; i++) {
            map.put(nums[i], i) ; 
        }
        
        int ans = nums.length+1;
        
        for(int i = 1; i <= nums.length; i++){
            	
                if(map.containsKey(i)){
                		
                }
                else{
                	ans = i;
                    return ans;
                }
        }
        return ans;
    }
}