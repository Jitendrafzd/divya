import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class demo
{
public static void main(String args[])
{
Pattern compile=Pattern.compile("[0-9]{2}[A-Z]{2}[0-9][A-Z][0-9]{4}");
Matcher matcher=compile.matcher("16EM1A0507");
while(matcher.find())
{
System.out.println(matcher.group());
}
}
}

