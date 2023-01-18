#include <stdio.h>

int factorial(int n){
   return  (n==1)?1:n * factorial(n-1);
}

int main() { 
    int row,col;
    printf("Please enter number or rows and column");
    scanf("%d%d",&row,&col);
    int ways = factorial(m-1+n-1) / ( factorial(m-1) * factorial( n-1));
    printf("Number of ways are %d",ways);    
}








/*

#include <stdio.h>
int countWays(int n, int m):
      return (n==1||m==1)?1:countWays(n-1,m)+countWays(n,m-1);
int main(){
   int n, m:
   scanf("%d%d",&n,&m);
   printf("Number of ways are %d",countWays(n,m));

}

*/