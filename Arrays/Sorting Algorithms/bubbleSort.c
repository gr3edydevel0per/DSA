#include <stdio.h>

int swapNum(int *x, int *y){
    *x = *x ^ *y;
    *y = *x ^ *y;
    *x = *x ^ *y;
}

int main() {

 int nums[] = {1,5,6,2,7,8,9,3,4};
 int arrLength  = sizeof(nums)/sizeof(nums[0]);
 for(int i=0;i<arrLength-1;i++){
   for(int j=0;j<arrLength-1;j++){
    if(nums[j]>nums[j+1]){
        swapNum(&nums[j],&nums[j+1]);
    }
}}

 for(int i=0;i<arrLength;i++){
     printf("%d",nums[i]);

}
    
    
}