import java.util.*;
class Sortinghash
{
public static void main(String args[])
{
HashMap<Integer,String> h=new HashMap<Integer,String>();
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
for( int i=0;i<n;i++)
{
int key=sc.nextInt();
String value= sc.next();
h.put(key,value);
}
TreeMap<Integer,String>t=new TreeMap<Integer,String>(h);
for(Integer i:t.keySet())
{
System.out.println(i+"="+t.get(i)+" ");
}}}