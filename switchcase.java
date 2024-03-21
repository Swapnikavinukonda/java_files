import java.util.*;
public class switchcase
{
public static void main(String[]args)
{
int a=8,b=8;
Scanner sc=new Scanner(System.in);
System.out.println("******");
System.out.println("*ARITHMETIC OPERATIONS");
System.out.println("1.ADD");
System.out.println("2.SUB");
System.out.println("3.MUL");
System.out.println("4.DIV");
System.out.println("ENETR YOUR CHOICE");
int ch=sc.nextInt();
switch(ch)
{
case 1-> System.out.println("addition is"+(a+b));
case 2-> System.out.println("subtraction is"+(a-b));
case 3-> System.out.println("multiplication is"+(a*b));
case 4-> System.out.println("addition is"+(a/b));
default->System.out.println("give proper option");
}
sc.close();
}
}