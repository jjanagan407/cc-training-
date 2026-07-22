#include <stdio.h>

int main()
{
    int n,k;
    scanf("%d %d",&n,&k);
    
    int maxAnd = 0;
    int maxOr = 0;
    int maxXor = 0;
    
    for(int a=1; a<=n ;a++){
        for(int b=a+1; b<=n; b++){
            if((a & b) < k && (a & b)> maxAnd)
            maxAnd = (a&b);
            if((a | b) < k && (a | b)>maxOr)
            maxOr = (a | b);
            if((a ^ b) < k && (a ^ b)> maxXor)
            maxXor = (a ^ b);
        }
    }
    printf("%d\n",maxAnd);
    printf("%d\n",maxOr);
    printf("%d\n",maxXor);
    
    return 0;
}