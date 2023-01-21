#include <stdio.h>

   if (isSafe(maze,m,n)){
   return (m==0 || n==0)?1: uniquePathsWithObstacles(obstacleGrid,obstacleGridSize-1-1,n)+ uniquePathsWithObstacles(maze,m,n-1);}
    else{
        return 0;
    } 