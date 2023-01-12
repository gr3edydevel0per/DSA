#include <stdio.h>
int main(){
 long num,factorial=1;
 printf("Enter the number \n");
 scanf("%ld",&num);
 for(int i=num;i>=1;i--){
   factorial*=i;
 }
 printf("Factorial of %d is %d",num,factorial);
 
}