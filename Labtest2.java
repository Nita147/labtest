import java.util.*;
public class Labtest2 {
public static void main(String args[])
{    
	
	int balance=1000;
	try {
   System.out.println("enter amount of balance to be withdraw");
   
	Scanner sn=new Scanner(System.in);
	int rs=sn.nextInt();
	
	if(balance<rs)
	throw new Exception("insufficent balance");
	balance =balance-rs;
	System.out.println("current balance"+balance);
	}catch(Exception e)
	{
		System.out.println("Exception is"+e.getMessage());
	}finally {
		System.out.println("transction complete ");
	}
	
}

}
