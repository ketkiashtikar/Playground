#include <stdio.h>
int main() {
  int n,temp,sum=0,f=1,rem;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
    f=1;
    rem=n%10;
    for(int i=1;i<=rem;i++)
    {
f=f*i;
    }
    sum=sum+f;
    n=n/10;
  }
  if(temp==sum)
    printf("Yes");
  else
    printf("No");
	//Type your code
	return 0;
}