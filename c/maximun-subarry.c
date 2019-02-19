#include <stdio.h>

int maxSubArray(int* nums, int numsSize) {
	int sum = 0;
	int res = nums[0];

	for (int i = 0; i < numsSize; ++i)
	{
		sum += nums[i];
		if (sum > res) {
			res = sum;
		}

		if (sum < 0) {
			sum = 0;
		}
	}

	return res;
}

int main(int argc, char const *argv[])
{
	int test[] ={-2,1,-3,4,-1,2,1,-5,4};
	printf("%d\n", maxSubArray(test, 9));
	return 0;
}