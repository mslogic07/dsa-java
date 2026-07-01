class Solution {
public:
    void moveZeroes(vector<int>& nums) {
    if (nums.size() == 1) {
        return;
    }
    int counter = 0;
    for (int i = 0; i < nums.size(); i += 1) {
        if (nums[i] == 0) {
            counter += 1;
        }
    }
    int index = 0;
    int i = 0;
    while (i < nums.size()) {
        if (nums[i] != 0) {
            nums[index] = nums[i];
            index += 1;
            i += 1;
        } 
        else {
        i += 1;
        }
    }
  int j = nums.size() - 1;
    while (counter > 0) {
        nums[j] = 0;
        counter -= 1;
        j -= 1;
    }
    

        
    }
};