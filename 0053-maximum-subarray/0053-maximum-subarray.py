class Solution(object):
    def maxSubArray(self, nums):
        maxi = nums[0]
        csum = 0
        for i in nums:
            csum += i
            maxi = max(csum,maxi)
            if csum < 0:
                csum = 0
        return maxi
        