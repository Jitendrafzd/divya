import java.io.*;
import java.util.*;
class star
{
public static void main(String args[])
{

int m[]={1,2,3,2,1};
int l=m.length;
for(int i=0;i<l;i++)
{
for(int j=0;j<l;j++)
{
if(j==i||j==(l-1-i))
{
System.out.print(m[j]);
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}
