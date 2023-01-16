#include <stdio.h>

int factorial(int num){
    return (num==1)?1:num*factorial(num-1);
}

int main(){
    int num;
    scanf("%d",&num);
    printf("Factorial is %d",factorial(num));
}