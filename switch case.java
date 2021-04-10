import java.util.Scanner;
public class Main{
public static void main(String[]args){
int choice;
System.out.println("pick one: 1. Hi\t2. Hey\t 3. Hello\t");
Scanner s = new Scanner(System.in);
choice = s.nextInt;
switch(choice);
{
case 1 : System.out.println("you said Hi");
       break;
case 2 : System.out.println("you said Hey");
       break;
case 3 : System.out.println("you said Hello");
       break;
defaul :  System.out.println("Invalid choice");
}
}
}
