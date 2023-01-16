#include <stdio.h>
#include <string.h>
#include <stdbool.h>


int main() {
int num;
printf("Please enter the range\n");
scanf("%d",&num);
bool arr[num+1];
memset(arr,true,sizeof(arr));


for(int i=2;i*i<=num;i++){
        if (arr[i] == true) {
            for (int j = i * i; j <= num; j += i)
                arr[j] = false;
        }
}

for(int k=0;k<=num;k++){
   if(arr[k]){
       printf("%d \t",k);
   }
}

}