from pprint import pprint


class Solution:
    def subsets(self, nums: 'List[int]') -> 'List[List[int]]':
        res = [[]]
        for i in nums:
            new_res = res[:]
            for j in new_res:
                res.append([i] + j)
        return res


if __name__ == '__main__':
    s = Solution()
    pprint(s.subsets([1,2,3]))
