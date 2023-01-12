#include <stdio.h>

int main() {
int num;
printf("Please enter the range\n");
scanf("%d",&num);
int arr[num+1]={1};
arr[0]=0;
arr[1]=0;
for(int i=2;i*i<=num;i++){
 for(int j=2*i;j<=num;j++){
   arr[j]=0;
   }
}

for(int k=0;k<=num;k++){
    printf("%d -> %d",k,arr[k]);
}

}