
/*
In binary form there is pattern that first place bit of every odd number is 1
 and for even number it is 0 so if we apply bitwise and (&) on number with 1 
 the result will determine whether the number is even or odd
 Now :
 if a&1 = 1 then it is odd
 else it is even 
 Why using a&1 over a%2  because & is working over bits 
*/




#include <stdio.h>

int main() {
 int a;
 printf("Please  enter number to check");
 scanf("%d",&a);
 (a&1)== 1)?printf("Odd"):printf(?"Even Number");
return 0

}
