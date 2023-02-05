#include <stdio.h>

int pow(int a,int b){
    return (b==0)?1:a*pow(a,b-1); 
}

int main(){
    int num,expo;
    printf("Please enter base and power \n");
    scanf("%d %d",&num,&expo);
    printf("%d",pow(num,expo));
}