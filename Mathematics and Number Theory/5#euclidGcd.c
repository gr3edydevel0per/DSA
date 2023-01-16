/*  To find the  greatest common divisor between two number 
Given a and b ; Gcd(a,b) = Gcd(a-b,b)->(a>b) .... ..continue this until b becomes zero
 or 
 gcd(a,b) = gcd(b,a%b)
 */



#include <stdio.h>

int euclidGCD(int a , int b){
    return b==0?a:euclidGCD(b,a%b);
}

int main(){
int a ,b,gcd;
scanf("%d%d",&a,&b);
gcd=euclidGCD(a,b);
printf("GCD of a and b is %d",gcd);

}