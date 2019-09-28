class Pww
{
public static void main(String[] args)
{
for(int i=1;i<=5;i++)
{
for(int k=4;k>=i;k--)

System.out.print(" ");

for(int j=1;j<=i;j++)

System.out.print("*");
System.out.println();
}
}
}



class Qww
{
public static void main(String[] args)
{
int n=5;
for (int i=0; i<n; i++) 
        { 
            for (int j=n-i; j>1; j--) 
            { 
                
                System.out.print(" "); 
            }  
            for (int j=0; j<=i; j++ ) 
            { 
                
                System.out.print("* "); 
            } 
   
         
            System.out.println(); 
} 
}
}

class kww 
{
char ch='A';
public static void main(String[] args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5-i;j++)
{
System.out.print(" ");
}
ch='A';
for(j=1;j<=i;j++)
{
Sytem.out.print(ch);
ch++;
}
for(j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}
