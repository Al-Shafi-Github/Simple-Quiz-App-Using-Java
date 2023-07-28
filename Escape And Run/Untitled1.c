#include<stdio.h>
int i,a,b,c;
void c1()
{
    printf("          \n");
    printf("          \n");
    printf("          \n");
    printf("     ___  \n");
    printf("  :3  |   \n");
    c2();

}
void c2()
{
    printf("          \n");
    printf("          \n");
    printf("   :3     \n");
    printf(" / ___   \n");
    printf("    |    \n");
    c3();
}
void c3()
{
    printf("          \n");
    printf("          \n");
    printf("          \n");
    printf(" ___  \\   \n");
    printf("  |     :3 \n");
}
int main()
{
    int x;
    scanf("%d",&x);
    switch(x)
    {
        case 1: c1();
        break;
        default: printf("Error");
        break;
    }
}
