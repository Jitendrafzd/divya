import java.io.*;
public class merge
{
public static void main(String args[])throws IOException
{
PrintWriter pw=new PrintWriter("file3.txt");
BufferedReader br1=new BufferedReader(new FileReader("file1.txt"));
BufferedReader br2=new BufferedReader(new FileReader("file2.txt"));
String l1=br1.readLine();
String l2=br2.readLine();
while (l1 != null || l2 !=null)
        {
if(l1!=null) 
	{		
                pw.println(l1);
           	
            }
             if(l2!=null)
		{
		pw.println(l2);
		l2=br2.readLine();
		}
pw.flush();
br1.close();
br2.close();
pw.close();
System.out.println("Merge completed");
}
}
	

