/**
  Trailing zeros are a sequence of 0 in the decimal representation
  (or more generally, in any positional representation) of a number, 
  after which no other digits follow..

  How to find trailing zeros:
  Let num is 30
  Factorial of 30 is ->30! = 30*29....*25....*20...*10...*5...*2..1
  Now we get zero by pair of 2, 5 
  So what we can do is we can calculate the the number of these pair and will get
  number of trailing zeros but there is a problem that the number of 2's in a factorial
  is always greater than number of 5's 
  
  Solution- 
    for i=5 ; i<num; i*=5
        res= res+ (num/i)

*/

#include <stdio.h>
int main()
{
    int Ztrail = 0;
    long num;
    printf("Enter the number \n");
    scanf("%ld", &num);

    // Finding the trailing zero
    for (int i = 5; i < num; i *= 5)
    {
        Ztrail += (factorial / i);
    }
}