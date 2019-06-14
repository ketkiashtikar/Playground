#include<stdio.h>
int main()
{
  int a,a1,a2,a3,a4;
  scanf("%d",&a);
  a1=a%10000;
  a2=a1%1000;
  a3=a2%100;
  a4=a3/10;
  printf("%d",a4);
  //Type your code here
  return 0;
}