#include <stdio.h>

int binarySearch(int arr[],int target,int start,int end){
      int mid; 
     if (start<=end){
        mid = start + (end-start)/2;
        if (arr[mid]<target){
            return  binarySearch(arr,target,mid+1,end);
        }
        else if (arr[mid]==target){
            return mid;
        }
        else{
            return binarySearch(arr,target,start,mid-1);
        }
     }

   return -1;

}


int main(){
  int arr[] = {1,2,4,5,6,7,12,19};
  int result = binarySearch(arr,12,0,7);
  return result==-1?printf("Element not  found"):printf("%d",result);


}