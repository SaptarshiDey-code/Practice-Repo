import java.util.*;
public class SecondL {
	public int second(int A[]) {
		int sl=A[0];
		int l=A[0];
		for(int i=0;i<A.length;i++) {
			if(A[i]>l) {
				sl=l;
				l=A[i];
			}
			else if(A[i]>sl) {
				sl=A[i];
			}
		}
		return sl;
	}
	public int secondS(int A[]) {
		int ss=A[0];
		int s=A[0];
		for(int i=0;i<A.length;i++) {
			if(A[i]<s) {
				ss=s;
				s=A[i];
			}
			else if(A[i]<ss) {
				ss=A[i];
			}
		}
		return ss;
	}
	public static void main(String args[]) {
		int A[],n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Array Size:");
		n=sc.nextInt();
		A=new int[n];
		System.out.println("Enter The Array Elements:");
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		SecondL ob=new SecondL();
		System.out.println("Second Largest:"+ob.second(A));
		System.out.println("Second Smallest:"+ob.secondS(A));
	}
}
