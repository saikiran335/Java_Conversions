public class stringconversions
{
public static void main(String[] args)
{
String s="100";
int i=Integer.parseInt(s);
long l=Long.parseLong(s);
float f=Float.parseFloat(s);
double d=Double.parseDouble(s);
char c;
Object obj=s;
System.out.println(i);
System.out.println(l);
System.out.println(f);
System.out.println(d);
for(i=0;i<s.length();i++)
{
System.out.println(s.charAt(i));
}
System.out.println(obj);
}
}