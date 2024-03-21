import java.util.*;
public class nestedif
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enetr your fav iconic character");
String act=sc.nextLine();
if(act.equals("iron man"))
{
System.out.println("great choice");
System.out.println("enter"+act+"real name");
String reall=sc.nextLine();
if(reall.equalsIgnoreCase("tony start"))
{
System.out.println("cool actor");
}
}
else
{
System.out.println(act);
}
sc.close();
}
}
