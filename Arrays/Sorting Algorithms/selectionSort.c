// Complexity analysis
/*

Average - O(n2)
Worst   - O(n2)
Best    - O(n2)

*/


#include <stdio.h>

void swap(int* x, int* y){
    int temp = *x;
    *x = *y;
    *y = temp;
}

int findMax(int arr[], int start, int end){
    int index = start;
    for(int i = start + 1; i <= end; i++){
        if (arr[index] < arr[i]){
            index = i;
        }
    }
    return index;
}

int main(){
    int max, last;
    int arr[] = {2, 1, 6, 7, 9, 8};
    int arrLen = sizeof(arr) / sizeof(arr[0]);

    for(int i = 0; i < arrLen; i++){
        last = arrLen - i - 1;
        max = findMax(arr, 0, last);
        swap(&arr[last], &arr[max]);
    }

//Displaying the array after sorting 
 for(int i=0;i<arrLen;i++){
     printf("%d ",arr[i]);
 }

}