import java.util.*;
interface t
{
	public void dispTime_Insec();
	public void dispTime_Inhrs();
}
class Time implements t
{
	int sec;
	int hrs;
	int min;
	public void dispTime_Insec() {
		 sec=min*60;
		System.out.println("time is="+sec+"sec");
	}
	public void dispTime_Inhrs() {
		
	       hrs=min/60;
	       System.out.println("time is="+hrs+"hr");
	}
	public void AcceptMin()
	{    
		System.out.println("Enter time in min");
		Scanner sc=new Scanner(System.in);
		min=sc.nextInt();
				
	}
}
public class Labtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Time t1=new Time();
     t1.AcceptMin();
     t1.dispTime_Inhrs();
     t1. dispTime_Insec();
	}

}
