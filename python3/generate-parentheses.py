class Solution:
    def get_sum(self, res, current, left, right, n):
        if right == n:
            res.append(current)
            return
        if left != n:
            self.get_sum(res, current + '(', left + 1, right, n)
        if right != left:
            self.get_sum(res, current + ')', left, right + 1, n)
            
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        self.get_sum(result, '', 0, 0, n)
        return result
