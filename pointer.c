#include <stdio.h>
#include <stdlib.h>
int main()
{
int a=15,*b,**c;
b=&a;
c=&b;
printf("A value:%d\n",a);
printf("A address:%d\n",&a);
printf("A address:%d\n",b);
printf("B address:%d\n",&b);
printf("A value:%d\n",*b);
printf("B address:%d\n",c);
printf("A address:%d\n",*c);
printf("A value:%d\n",**c);
return 0;
}