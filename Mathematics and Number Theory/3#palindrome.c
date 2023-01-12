#include <stdio.h>

int main(){
int num,revNum=0,digit;

printf("Please enter the number to check "); 
scanf("%d",&num);
int temp=num;
while(temp!=0){
 digit=temp%10;
 temp=temp/10;
 revNum= (revNum*10)+digit;
}
(revNum^num==0)?printf("Number is palindrome"):printf("Number is not palindrome");
}