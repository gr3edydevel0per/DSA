/*
Finding the only non repaeting elemnt in the array 
Key point :
 a ^ 0 -> a
 a ^ a -> 0

r = 0
 using for loop triversing over array and calculating
   r =  arr[i] ^ r
   
Working :  initially r = 0
 let arr have elements 5 5 3 3 1 7 7 8 8 6 6
 after for loop :
  r  = 5 ^ 0 ^ 5 ^ 3 ^ 3 ^ 1 ^ 7 ^ 7 ^ 8 ^ 8 ^ 6 ^ 6
  then
  r = 1 
    
 
 
*/

#include <stdio.h>

int main() {

int arr[] = {3,3,5,1,5,6,7,8,7,6,8};
int length=sizeof(arr)/sizeof(arr[0]);
int Result = 0;

for(int i=0;i<length;i++){
    Result = arr[i] ^ Result;
    }
    printf("Non repeating element is  %d",Result);


}