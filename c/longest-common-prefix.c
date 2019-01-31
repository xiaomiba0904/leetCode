#include <stdio.h>
#include <stdlib.h>


char* longestCommonPrefix(char** strs, int strsSize) {
	int common_number = 0;
	if (strsSize <= 0) {
		goto END;
	}

	while (1) {
		char com = strs[0][common_number];
		for (int i = 0; i < strsSize; ++i)
		{
			if (strs[i][common_number] != com ||
			 strs[i][common_number] == '\0') {
				goto END;
			}
		}
		common_number++;
	}

END:{
		char *r = (char *)malloc(sizeof(char) * (common_number+1));
	if (common_number == 0) {
		r = "";
		return r;
	}

	for (int i = 0; i < common_number; ++i)
	{
		r[i] = strs[0][i];
	}
	r[common_number] = '\0'
	return r;
}

}

int main(int argc, char const *argv[])
{
	/* code */
	char *strs[] = {"flower","flow","flight"};
	char *result;
	result = longestCommonPrefix(strs, 3);
	printf("%s\n", result);
	return 0;
}