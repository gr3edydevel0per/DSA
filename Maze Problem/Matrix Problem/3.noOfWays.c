#include <stdio.h>
#include <stdbool.h>


bool isSafe(int maze[3][3], int m , int n ){
    return (maze[m][n]==1)?false:true;
}



int countWays(int maze[3][3],int m , int n){
   if (isSafe(maze,m,n)){
   return (m==0 || n==0)?1:countWays(maze,m-1,n)+countWays(maze,m,n-1);}
    else{
        return 0;
    }
    
}

int main(){
	int board[3][3] = { { 0, 1, 0 },
						{ 0, 0, 0 },
						{ 0, 0, 0}};
   printf("No of ways to reach from (0,0) to (3,3) is %d",countWays(board,2,2));
   return 0;
   
}