class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        for i in nums2:
            nums1.append(i)
        nums1.sort()
        if len(nums1)%2!=0:
            return nums1[len(nums1)//2]
        else:
            leeft = int(len(nums1)/2)-1
            rright = int(len(nums1)/2)
        return (nums1[leeft]+nums1[rright])/2
        