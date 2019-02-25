class Solution:

    def multiply(self, num1: 'str', num2: 'str') -> 'str':
        if num1 == '0' or num2 == '0':
            return '0'

        num1_len = len(num1)
        num2_len = len(num2)

        result = [0 for _ in range(num1_len + num2_len)]

        for i in range(num1_len-1, -1, -1):
            num1_value = int(num1[i])
            for j in range(num2_len-1, -1, -1):
                sum_value = int(num2[j]) * num1_value + result[i+j+1]
                result[i+j] += sum_value // 10
                result[i+j+1] = sum_value % 10

        s = 0
        for i in range(num1_len + num1_len):
            if result[i] == 0:
                s+=1
            else:
                break
        return ''.join(map(str, result[s:]))


if __name__ == '__main__':
    s = Solution()
    print(s.multiply("17", "18"))
