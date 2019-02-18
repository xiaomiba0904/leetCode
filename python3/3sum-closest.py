class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums_len = len(nums)
        if nums_len <= 3:
            return sum(nums)

        result = set()

        for i in range(nums_len):
            a = nums[i]
            for j in range(i+1, nums_len):
                b = nums[j]
                for q in range(j+1, nums_len):
                    c = nums[q]
                    result.add(a+b+c)

        x = result.pop()
        mix = abs( x - target)

        for i in result:
            value = abs(target - i)
            if value <= mix:
                mix = value
                x = i

        return x

    def threeSumClosest_best(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        nums_len = len(nums)
        if nums_len <= 3:
            return sum(nums)

        res = nums[0] + nums[1] + nums[2]
        if res > target:
            return res

        for i in range(nums_len):
            left = i+1
            right = nums_len - 1
            index_value = nums[i]
            while (left < right):
                sum_value =  index_value+ nums[left] + nums[right]
                if (sum_value > target):
                    right -= 1
                elif (sum_value < target):
                    left += 1
                else:
                    return target

                if abs(sum_value - target) < abs(res - target):
                    res = sum_value

        return res
