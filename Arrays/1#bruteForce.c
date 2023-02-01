#include <stdio.h>
int main(){
int nums[] = {4,5,3,9,1,6,2,1,3,8,1},max=0,count=0,index;

int arrLength = sizeof(nums)/sizeof(nums[0]);

for(int i=0 ; i<arrLength;i++){
       count=0;
      for(int j =0; j<arrLength;j++){
            if (nums[i]==nums[j]){
                  count++;
            }
      if (max==0){
            max=count;
      }
      else if(max<count){
            max=count;
            index=i;

      }
      }
}
printf("The maximum occurring element is %d",nums[index]);
}