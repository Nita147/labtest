import java.util.*;

public class labtest3 {
	static Scanner sn= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		divideByzerodemo();
		simpleExceptionDemo();
		nullpointerdemo();
		arrayindexdemo();
	}
	private static void arrayindexdemo()
	{
		int [] arr =new int[] {23,52,45,78,15};
		int index=0;
		try
		{
		index =sn.nextInt();
		System.out.println(String.format("the value of position %d is %d",index,arr[index]));
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(String.format("no element at position %d value should be within %d",index,(arr.length -1)));
		}
	}
	private static void simpleExceptionDemo() {
		System.out.println("Enter a number");
		//try without try block first....
		try {
			int no = sn.nextInt();
			System.out.println("The value: " + no);
		}catch(InputMismatchException miss) {//Java Runtime will create an object of this class and throw this exception to UR code which U catch...
			System.err.println("Expected a number as input within the range of " + Integer.MIN_VALUE + " and " + Integer.MAX_VALUE); //err object is used to display Error information on Console..
	}
}
	private static void divideByzerodemo() {
		boolean condition = true;
	do {
			try {
			System.out.println("enter the number to divide");
			int first=sn.nextInt();
			System.out.println("enter the non zero dividend");
			int second=sn.nextInt();
			int res=first / second;
			System.out.println("the quotient is "+res);
			condition = true;
		}catch (ArithmeticException ex) {
			System.out.println("dont put zero");
			condition=false;
		}
			
		}while(!condition);
	}
	private static void nullpointerdemo()
	{
		try {
		fruit f = null;
		System.out.println("the default of fruit is"+f.name );
		}catch(NullPointerException ex) {
			System.out.println(" the fruit info not set properly");
		}
	}
	}


