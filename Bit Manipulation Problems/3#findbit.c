/*
To find ith bit of a number
1. Create a a bit mask by right shifting one ith times
2. Perform bitwise and (&) between number and mask
3. if result is 0 then it is an off bit else it is a set bit


*/

#include <stdio.h>
int main(){
//Finding 4 bit of 100110101 i.e. 309
int a=309;
//Creating Mask 
int b= 1<<4;
(a&b==0)?printf("4 th bit is off bit"):printf("4th bit is set bit");
return 0;

}