#include <stdio.h>
#include <float.h>


double myPow(double x, int n) {
	double result =1.0;

    if (n == 0) {
        return 0.0;
    }else if( n > 0) {
        for (int i = 0; i < n; ++i)
        {
        	result = result * x;
        	if (result >= DBL_MAX) {
        		return DBL_MAX;
        	}
        }
        return result;
    }else {
    	for (int i = 0; i < n * -1; ++i)
    	{
    		result = result * x;
    		if (result >= DBL_MAX) {
        		return DBL_MIN;
        	}
    	}
    	return 1/result;
    }
}