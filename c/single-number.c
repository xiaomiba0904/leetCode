#include <stdio.h>

/* 
原理是：
0异或任何数，其结果=任何数，
因为数组中的数字出现2次，
所以所有的异或操作都相互抵消
*/
int singleNumber(int* nums, int numsSize) {
    int a = 0;
    for (int i = 0; i < numsSize; ++i) {
        a = a ^ nums[i];
    }
    return a;
}


int main(int argc, char const *argv[])
{
	int test[] = {4,1,2,1,2};
	printf("%d\n", singleNumber(test, 5));
	return 0;
}