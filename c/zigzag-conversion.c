#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

char* convert(char *s, int numRows) {
	if (numRows <= 1) {
		return s;
	}

	int s_len = strlen(s);
	int cha = (numRows - 1)*2;
	char *result = (char *)calloc(s_len+1, sizeof(char));
	result[s_len] = '\0';

	int s_index = 0;
	int r_index = 0;

	for (int i = 0; i < numRows; ++i)
	{
		for (int j = 0; j < s_len; ++j)
		{	
			s_index = i;
			if (i > 0 && i < (numRows-1)) {
				if (j%2 == 1) {
					s_index = s_index  + (cha - pow(2, i));
				}else{
					s_index = cha *(j/2) + i;
				}
			}else {
				s_index = cha *j + i;
			}

			if (s_index >= s_len) {
				break;
			}
			result[r_index] = s[s_index];
			r_index++;
		}
	}

	return result;
}

int main(int argc, char const *argv[])
{
	char *test = "LEETCODEISHIRING";
	printf("%s\n", convert(test, 4));


	return 0;
}