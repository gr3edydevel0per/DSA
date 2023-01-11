/*
We can swap two numbers using xor operator 
with out using a third variable
*/

#include <stdio.h>


int  main() {  
 int x=4,y=9;22
 x=x^y;
 y=x^y;
 x=x^y;
 printf("After swapping : ")
 printf("X = %d , y =  %d",x,y);


    return 0;
}