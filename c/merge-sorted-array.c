#include <stdio.h>
#include <stdlib.h>

void printf_array(int* nums, int count) {
	printf("[");
	for (int i = 0; i < count; ++i)
	{
		printf("%d,", nums[i]);
	}
	printf("]\n");
}

void merge(int* nums1, int m, int* nums2, int n) {
	if (n == 0) {
		return;
	}
    
    int nums1_index = 0;
    int nums2_index = 0;

    int *tmp = (int *)malloc(sizeof(int) * (m));
    for (int i = 0; i < m; ++i)
    {
    	tmp[i] = nums1[i];
    	nums1[i] = 0;
    }

    int value;
    for (int i = 0; i < (m + n); ++i)
    {
    	if (nums1_index >= m && nums2_index < n) {
    		value = nums2[nums2_index];
    		nums2_index++;
    	}

    	else if (nums2_index >= n && nums1_index < m) {
    		value = tmp[nums1_index];
    		nums1_index++;
    	}

    	else if (tmp[nums1_index] >= nums2[nums2_index]) {
    		value = nums2[nums2_index];
    		nums2_index++;
    	}

    	else if (tmp[nums1_index] < nums2[nums2_index]) {
    		value = tmp[nums1_index];
    		nums1_index++;
    	}

    	nums1[i] = value;
    }

}

void merge_fast(int* nums1, int m, int* nums2, int n) {
	// 从大到小排序
	int numsSize=m+n-1;
    m--;n--;
    while(m>=0&&n>=0){
        nums1[numsSize--]=(nums1[m]>nums2[n])? nums1[m--]:nums2[n--];
    }
    while(n>=0){
        nums1[numsSize--]=nums2[n--];
    }
}

int main(int argc, char const *argv[])
{
	int nums1[] = {-1,0,0,3,3,3,0,0,0};
	int nums2[] = {1,2,2};
	merge(nums1, 6, nums2, 3);
	printf_array(nums1, 9);
	return 0;
}