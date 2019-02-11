#include <stdio.h>
#include <float.h>


double myPow_best(double x, int n) {
	if(0 < n)
    {
        if(0 == n%2)
        {
            return myPow(x,n/2)*myPow(x,n/2);
        }
        else
        {
            n = n - 1;
            return myPow(x,n/2)*myPow(x,n/2)*x;
        }
    }
    else if(0 > n)
    {
        //考虑边界 -2147483648
        if(2147483647 == abs(n+1))
        {
            x = 1/x;
            n = abs(n+1);
            return myPow(x,n)*x;
        }
        x = 1/x;
        n = 0 - n;
        return myPow(x,n);
    }
    return 1;
}
