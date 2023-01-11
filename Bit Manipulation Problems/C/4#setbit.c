/*
To set it  ith bit of a number

1. Create mask by right shifting 1 ith time
2. perform bitwise or operation between the number and the mask
*/


#include <stdio.h>

int main(){
int a=0b100110101;

//Setting third bit
//Creating Mask
int mask = 1<<3;
int result = a|mask;
printf("%d",result);

}