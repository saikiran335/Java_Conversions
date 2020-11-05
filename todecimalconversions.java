public class todecimalconversions
{
public static void main(String[] args)
{
String binary="10101";
String octal="121";
String hexa="121";
System.out.println("binary to decimal:"+ Integer.parseInt(binary,2));
System.out.println("octal to decimal:"+ Integer.parseInt(octal,8));
System.out.println("hexa to decimal:"+ Integer.parseInt(hexa,16));
}
}