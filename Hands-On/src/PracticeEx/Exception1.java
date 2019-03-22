package PracticeEx;
class NegNum extends Exception
{
	public NegNum(int n) {
		
		if(n<0) {
			System.out.println("Number Is Negative");
		}
		
	}
}
public class Exception1 {
	public static void main(String args[]) {
		int num=4;
		try {
			throw new NegNum(num);
		}
		catch(NegNum e) {
			System.out.println("Please Enter a Valid Number");
			
		}
		System.out.println(num);
	}

}
