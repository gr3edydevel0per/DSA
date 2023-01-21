#include <stdio.h>

int countWays(int m , int n){
   return (m==1 || n==1)?1:countWays(m-1,n)+countWays(m,n-1);}

int main(){
   int row,col;
   printf("Enter row and column :");
   scanf("%d%d",&row,&col);
   printf("No of ways to reach from (0,0) to (%d,%d) is %d",row-1,col-1,countWays(row,col));
   return 0;
}