#include <stdio.h>


int searchInsert(int *nums, int numsSize, int target) {
	for (int i = 0; i < numsSize; ++i)
	{
		/* code */
		if (nums[i] >= target) {
			return i;
		}
	}

	return numsSize;
}


int main(int argc, char const *argv[])
{
	int list[] = {1,3,5,6};
	int target = 5;
	printf("%d\n", searchInsert(list, 4, 5));
	return 0;
}