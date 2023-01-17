#include <stdio.h>


int countWays(int n, int m):
      return (n==1||m==1)?1:countWays(n-1,m)+countWays(n,m-1);


int main(){
   int n, m:
   scanf("%d%d",&n,&m);
   printf("Number of ways are %d",countWays(n,m));

}