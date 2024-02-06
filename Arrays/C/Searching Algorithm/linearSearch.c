
// Ad. of Linear Search can work on both sorted and unsorted data
// drawback O(n) Time Complexity

#include <stdio.h>

int main(){
 
 int arr[] = {1,2,3,4,5,6,7,8,45,76},target,arrLen = sizeof(arr)/sizeof(arr[0]);
 printf("Enter the element to search in the array \n");
 scanf("%d",&target);
 for(int i=0;i<arrLen;i++){
    if target == arr[i]{
        return i;
    }
 }
 return -1
}