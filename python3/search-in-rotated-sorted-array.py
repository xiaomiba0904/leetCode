class Solution:


    def dserch(self, nums, target):
        start = 0
        len_nums = len(nums)
        while len_nums>1:
            len_nums = len(nums)
            m = len_nums>>1
            if nums[m] == target:
                return start + m
            elif nums[m] > target:
                nums = nums[:m]
            else:
                nums = nums[m:]
                start += m
        if len_nums == 1:
            if nums[0] == target:
                return 0
            else:
                return -1

    def search(self, nums, target):
        length = len(nums)
        if length == 0:
            return -1

        begin = 0
        end = length - 1
        while end > begin:
            if end == begin + 1:
                break

            mid = (begin + end) // 2
            if nums[mid] > nums[begin]:
                begin = mid
            else:
                end = mid

        if nums[0] <= target <= nums[begin]:
            end = begin
            begin = 0
        elif nums[end] <= target and nums[-1] >= target:
            begin = end
            end = length - 1
        else:
            return -1

        r = self.dserch(nums[begin:end+1], target)
        if r == -1:
            return -1
        return begin + r


