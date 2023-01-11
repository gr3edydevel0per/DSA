/*
To clear ith bit on a number

1. Create a mask by right shifting 1 ith times
2. use tild operator on mask
3 perform bitwise and operation between number and the  new mask

*/

#include <stdio.h>
int main(){

int a=0b100110101;


// Want to clear 4
//Creating mask

int mask = 1<<4;
mask = ~mask;
int result = a&mask;





}