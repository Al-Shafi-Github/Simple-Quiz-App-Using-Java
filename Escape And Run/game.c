#include<stdio.h>
#include<string.h>
int exit=1,score=0;
struct player
{
    char name[50];
    int score;
};
void categories()
{
    int p;
    printf("What kind of Q would you like to answer?:\n");
    printf("1.GK\n2.Sports\n3.IQ- 2 Q only\n4.BACK\n5.EXIT\n");
    do
    {
        scanf("%d",&p);
        if(p!=1&&p!=2&&p!=3&&p!=4&&p!=5)
            continue;
        else if(p==5)
            exit=0;
        else
        {
            switch(p)
            {
                case 1:chooseGK();
                break;
                case 2:chooseSport();
                break;
                case 3:iQ1();
                break;
                case 4:playBoard();
                break;
            }
        }

    }while(exit);
}
void iQ1()
{
    char c;
    FILE *p;
    p=fopen("IQ_1.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='b')
        score=score+5;
    iQ2();
}
void iQ2()
{
    char c;
    FILE *p;
    p=fopen("IQ_2.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='c')
        score=score+5;
    saveScores();
}
void chooseGK()
{
    int p;
    printf("1.Bangladesh\n2.International Affairs\n3.BACK\n4.EXIT\n");
    while(exit)
    {
        scanf("%d",&p);
        if(p!=1&&p!=2&&p!=3&&p!=4)
            continue;
        else if(p==4)
            exit=0;
        else
        {
            switch(p)
            {
                case 1:bdQ1();
                break;
                case 2:iaQ1();
                break;
                case 3:categories();
                break;
            }
        }
    }
}
void iaQ1()
{
    char c;
    FILE *p;
    p=fopen("IAQ_1.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='d')
        score=score+2;
    iaQ2();
}
void iaQ2()
{
    char c;
    FILE *p;
    p=fopen("IAQ_2.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='c')
        score=score+2;
    iaQ3();
}
void iaQ3()
{
    char c;
    FILE *p;
    p=fopen("IAQ_3.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='c')
        score=score+2;
    iaQ4();
}
void iaQ4()
{
    char c;
    FILE *p;
    p=fopen("IAQ_4.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    iaQ5();
}
void iaQ5()
{
    char c;
    FILE *p;
    p=fopen("IAQ_5.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    saveScores();
}

void bdQ1()
{
    char c;
    FILE *p;
    p=fopen("BDQ_1.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='c')
        score=score+2;
    bdQ2();
}
void bdQ2()
{
    char c;
    FILE *p;
    p=fopen("BDQ_2.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='b')
        score=score+2;
    bdQ3();
}
void bdQ3()
{
    char c;
    FILE *p;
    p=fopen("BDQ_3.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    bdQ4();
}
void bdQ4()
{
    char c;
    FILE *p;
    p=fopen("BDQ_4.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    bdQ5();
}
void bdQ5()
{
    char c;
    FILE *p;
    p=fopen("BDQ_5.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='d')
        score=score+2;
    saveScores();
}
void iaQ()
{

}
void chooseSport()
{
    int p;
    printf("1.FOOTBALL\n2.CRICKET\n3.BACK\n4.EXIT\n");
    while(exit)
    {
        scanf("%d",&p);
        if(p!=1&&p!=2&&p!=3&&p!=4)
            continue;
        else if(p==4)
            exit=0;
        else
        {
            switch(p)
            {
                case 1:fQ1();
                break;
                case 2:cQ1();
                break;
                case 3:categories();
                break;
            }
        }
    }
}
void fQ1()
{
   char c;
    FILE *p;
    p=fopen("FQ_1.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    fQ2();
}
void fQ2()
{
   char c;
    FILE *p;
    p=fopen("FQ_2.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    fQ3();
}
void fQ3()
{
   char c;
    FILE *p;
    p=fopen("FQ_3.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='c')
        score=score+2;
    fQ4();
}
void fQ4()
{
   char c;
    FILE *p;
    p=fopen("FQ_4.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    fQ5();
}
void fQ5()
{
   char c;
    FILE *p;
    p=fopen("FQ_5.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    saveScores();
}
void cQ1()
{
    char c;
    FILE *p;
    p=fopen("CQ_1.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    cQ2();
}
void cQ2()
{
    char c;
    FILE *p;
    p=fopen("CQ_2.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    cQ3();
}
void cQ3()
{
    char c;
    FILE *p;
    p=fopen("CQ_3.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    cQ4();
}
void cQ4()
{
    char c;
    FILE *p;
    p=fopen("CQ_4.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='b')
        score=score+2;
    cQ5();
}
void cQ5()
{
    char c;
    FILE *p;
    p=fopen("CQ_5.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    char a;
    scanf(" %c",&a);
    if(a=='a')
        score=score+2;
    saveScores();
}
void saveScores()
{
    struct player p;
    FILE *f;
    f=fopen("Scores.txt","a");
    if(f!=NULL)
    {
        printf("ENTER NAME:");
        scanf("%s",&p.name);
        p.score=score;
        fprintf(f,"%s %d\n",p.name,p.score);
        fclose(f);
    }
    playBoard();
}
void showScores()
{
    while(exit)
    {
    char c;
    FILE *p;
    p=fopen("Scores.txt","r");
    if(p!=NULL)
    {
        while((c=getc(p))!=EOF)
            putchar(c);
        fclose(p);
    }
    int a;
    printf("\n1.BACK\n2.EXIT\n");
    scanf("%d",&a);
    switch(a)
    {
        case 1:playBoard();
        break;
        case 2:exit=0;
        break;
    }
    }
}
void playBoard()
{
    int p;
    printf("1.PLAY GAME\n2.SCORES\n3.EXIT\n");
    while(exit)
    {
    scanf("%d",&p);
    if(p!=1&&p!=2&&p!=3)
        continue;
    else if(p==3)
        exit=0;
    else
    {
    switch(p)
        {
            case 1: categories();
            break;
            case 2: showScores();
            break;
        }
    }

    }

}
int main()
{
    int i,pass;
       printf("ENTER PASSWORD:");
       for(i=0;i<5;i++)
       {
           scanf("%d",&pass);
           if(pass!=6238)
            continue;
            else
             break;
       }
       if(pass!=6238)
        printf("SORRY!ONLY MY BOSS CAN OPEN ME >_<\n");
       else
       {
           while(exit)
            {
                playBoard();
            }
       }
}
