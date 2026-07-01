class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maxiones = 0; 
        int count = 0;
        for(int i= 0 ; i < nums.size() ; i++){
          if(nums[i]==1){
              count++ ; 
          }
          else{
              count = 0 ; 
    // set count 0 if any zero occured in the loop 
          }
        maxiones  = max(maxiones , count) ;// store maximum current value 
      }  
      return maxiones ; 
    }

    
};