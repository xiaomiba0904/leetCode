class Solution:


    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        data = {
            '2': 'abc',
            '3': 'def',
            '4': 'ghi',
            '5': 'jkl',
            '6': 'mno',
            '7': 'pqrs',
            '8': 'tuv',
            '9': 'wxyz'
        }
        result = []
        len_digits = len(digits)
        if len_digits <= 0:
            return result

        def letter(index, last_str):
            if index >= len_digits:
                return

            for i in data[digits[index]]:
                this_str = last_str + i
                if len(this_str) >= len_digits:
                    result.append(this_str)
                letter(index+1, this_str)

        for index in range(len_digits):
            letter(index, "")

        return result


    def letterCombinations2(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        data = {
            '2': 'abc',
            '3': 'def',
            '4': 'ghi',
            '5': 'jkl',
            '6': 'mno',
            '7': 'pqrs',
            '8': 'tuv',
            '9': 'wxyz'
        }
        len_digits = len(digits)
        if len_digits <= 0:
            return []

        result = ['']
        for _, value in enumerate(digits):
            tmp = []
            for _, r_value in enumerate(result):
                for _, d_value in enumerate(data[value]):
                    tmp.append(r_value + d_value)
            result = tmp
        return result

