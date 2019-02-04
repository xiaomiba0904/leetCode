#include <stdio.h>

int maxArea(int* height, int heightSize) {
	int value = 0;
	int tmp = 0;
	int h = 0;
	for (int i = 0; i < heightSize-1; ++i)
	{
		for (int j = i+1; j < heightSize; ++j)
		{
			/* code */
			if (height[i] >= height[j]) {
				h = height[j];
			}else {
				h = height[i];
			}

			tmp = h * (j - i);
			if (tmp > value) {
				value = tmp;

			}

		}
	}

	return value;
}

int main(int argc, char const *argv[])
{
	int c[] = {1,8,6,2,5,4,8,3,7};
	printf("%d\n", maxArea(c, 9));
	return 0;
}