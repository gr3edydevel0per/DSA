#include <stdio.h>

int nSum(int num){
   return num==0?0:num+nSum(num-1);
}
int main(){
    int num;
    scanf("%d",&num);
    printf("%d",nSum(num));
}