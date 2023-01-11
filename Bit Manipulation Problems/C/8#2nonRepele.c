

#include <stdio.h>


int main(){

int res=0,res1=0,res2=0;
int arr[]= {5,5,6,6,1,3,4,3,4,2,6,7,8,9};
length = sizeof(arr)/sizeof(arr[0]);

for (int i =0 ; i<length;i++){
    res= arr[i]^res;
}

/* Now we have xor of two elements  that are non repeating let say 
res = a ^ b
Now we have to check the right most bit of res
if that bit is set bit that means right most bit of a and b is different
i.e. 1 is odd and 1 is even
*/


for (int i =0 ; i<length;i++){
    (res&1==1)?res1= arr[i]^res1:res2=arr[i]^res2;
}

printf("Non repeating elements are %d , %d"res1,res2);
return 0;
}
