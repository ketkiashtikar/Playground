#include<stdio.h>
int main()
{
  int n,sum=0;
  scanf("%d",&n);
  while(n>0)
  {
    sum=sum+(n%10);
  n=n/10;
    sum=sum%10+sum/10;
  }
  printf("%d",sum);
  return 0;
}
    
  