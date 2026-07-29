//Method overriding
import java.util.*;
class Methos_overriding
{
    static int add(int a,int b)
    {
        System.out.print("operations add");
        return a+b;
    }
   
}
class operation
{
    static int add(int a,int b)
    {
        System.out.print("operation add");
        return a+b;
    }
}
public class Method_overriding
{
	public static void main(String[] args) {
	    operation op=new operation();
	    operation ops=new operation();
	    Scanner sc=new Scanner(System.in);
	    System.out.println(op.add(sc.nextInt(),sc.nextInt()));
	    System.out.println(ops.add(sc.nextInt(),sc.nextInt()));
	    
	}
}