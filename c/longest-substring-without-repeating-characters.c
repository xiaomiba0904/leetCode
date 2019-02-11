#include <stdio.h>
#include <string.h>

int lengthOfLongestSubstring(char *s) {
	int s_len = strlen(s);
	if (s_len == 1) {
		return 1;
	}
	int max = 0;
	char *next;
	next = s;
	for (; *s != '\0' ; ++s)
	{
		for (next++; *next != '\0'; ++next)
		{
			if (*s == *next) {
				int value = next - s;
				if (value > max) {
					max = value;
				}
				break;
			}
		}
	}	

	return max;	
}

int main(int argc, char const *argv[])
{
	char s1[] ="abcabcd";
	char s2[] = "bbb";
	char s3[] = "pwwkew";
	printf("%d\n", lengthOfLongestSubstring(s1));
	printf("%d\n", lengthOfLongestSubstring(s2));
	printf("%d\n", lengthOfLongestSubstring(s3));
	return 0;
}