/*
    Fast Power (Binary Exponentiation) Formula:

    x^n =
        1                  if n == 0
        1 / x^(-n)         if n < 0
        (x^(n/2))^2        if n is even
        x * x^(n-1)        if n is odd
*/
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;

        long exp = n;
        double result = 1.0;
        double base =  x;

        if (exp < 0) {
            base = 1 / base;
            exp = -exp;
        }

        while (exp > 0) {
            if (exp % 2 == 1) {
                result *= base;
            }
            base *= base;
            exp /= 2;
        }
        
        return result;
    }
}
