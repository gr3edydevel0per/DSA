// Find the number of bits required to convert a to b

#include <stdio.h>

int main() {


int a = 0b100100110
int b = 0b101100101

/* Now if we apply xor between a and b 
   xor property if  1^1 , 0^0 -> 0
   else 1
 Now all after a^b all the same bits will become and zero and distinct bits will become 1
 Last step is to calculate no of 1 or set bits in the result
*/
int xorResult  = a^b;
int count=0;
while(xorResult!=0){
    xorResult = xorResult &(xorResult-1);
    count++;
}

printf("%d",count);

}