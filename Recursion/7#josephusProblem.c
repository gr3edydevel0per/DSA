#include <stdio.h>

int josephus(int people , int num){
     
     return (people==1)?0:(josephus(people-1,num)+k)%people;

}

int main(){
  int people=5,num=3;
  printf("%d",josephus(people,num));

}