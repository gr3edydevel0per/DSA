#include <stdio.h>

int josephus(int people , int num){
     
     return (people==1)?0:(josephus(people-1,num)+k)%people;

}

int main(){
  int people , num;
  printf("Please enter number of people : " );
  scanf("%d",&people);
  printf("Please enter the counter number : ");
  scanf("%d",&num);
  printf("Person won - Number %d",josephus(people,num));

}