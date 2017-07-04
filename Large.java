# thamil
import java.io.*;
import java.util.*;
public class Large
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a,b,c,largest;  
    System.out.println("Enter any number:");
    a=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    c=Integer.parseInt(br.readLine());
    if(a>=b && a>=c)
    {
      System.out.println("Largest number is : " +a);
      }
    else if(b>=a && b>=c)
    {        
      System.out.println("Largest number is : " +b);
      }
      else if(c>=a && c>=b)
      {
        
        System.out.println("Largest number is : " +c);
        }
        }
        }
