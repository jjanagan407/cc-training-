#include <stdio.h>
int main()
{
    char a;
    scanf("%c",&a);
    switch(a)
    {
        case 'A'...'Z':printf("uppercase");
        break;
        case 'a'...'z':printf("lowercase");
        break;
        case '0'...'9':printf("number");
        break;
    }
}