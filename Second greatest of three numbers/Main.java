#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  if((a>b)&&(a<c))
    printf("second greatest = %d",a);
  else if((b>a)&&(b<c))
    printf("second greatest = %d",b);
  else
    printf("second greatest = %d",c);
  return 0;
}