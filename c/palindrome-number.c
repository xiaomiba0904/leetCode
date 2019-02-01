#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>


bool isPalindrome(int x) {
	if (x < 0) {
		return false;
	}

	if (x < 10) {
		return true;
	}

	char int_str[12]; // int max 
	sprintf(int_str, "%d", x);
	printf("%s\n", int_str);
	int j, str_len;
	str_len = strlen(int_str);
	j = str_len - 1;

	for (int i = 0; i < str_len && j >= 0; ++i, --j)
	{
		if (int_str[i] != int_str[j]) {
			return false;
		}

	}
	
	return true;

}

bool isPalindrome_best(int x) {
    if (x < 0) {
        return 0;
    }
    int arr[10] = {0};
    int top = 0;
    // 将int翻转存入数组 123 -> [3,2,1]
    while (x > 0) {
        arr[top++] = x % 10;
        x /= 10;
    }
    // 对半对应位置比对
    for (int i = 0; i < (top >> 1); i++) {
        if (arr[i] != arr[top - i - 1]) {
            return 0;
        }
    }
    return 1;
}

int main(int argc, char const *argv[])
{
	int x = 1234321;
	bool result;
	result = isPalindrome(x);
	if (result) {
		printf("true\n");
	}else {
		printf("false\n");
	}
	return 0;
}