class Solution:

    def permute2(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        import itertools
        return list(itertools.permutations(nums))

    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        len_nums = len(nums)
        if len_nums == 1:
            return [nums]
        if len_nums == 2:
            return [nums, nums[::-1]]

        res = []
        for i in range(len_nums):
            num = nums[i]
            new_nums = nums[:]
            new_nums.pop(i)
            for item in self.permute(new_nums):
                item.append(num)
                res.append(item)
        return res

