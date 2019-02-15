class Solution:
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        a_set = set()
        b_set = set()
        nums.sort()
        nums_hash = {}
        result = list()
        for i in nums:
            if i >= 0:
                a_set.add(i)
            else:
                b_set.add(i)

            if i in nums_hash:
                nums_hash[i] += 1
            else:
                nums_hash[i] = 1

        if len(a_set) <= 0:
            return result

        if nums.count(0) >= 3 :
            result.append([0, 0, 0])

        b_list = list(b_set)
        for index, x in enumerate(b_list):
            for y in b_list[index:]:
                if x == y and nums_hash[x] < 2:
                    continue
                value = abs(x + y)

                if value in a_set :
                    result.append([x, y, value])

        a_list = list(a_set)
        for index, x in enumerate(a_list):
            for y in a_list[index:]:
                if x == y and nums_hash[x] < 2:
                    continue

                value = (x + y) * -1

                if value in b_set:
                    result.append([value, x, y])

        return result
