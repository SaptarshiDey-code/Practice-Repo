package Practice_Day1;
import java.util.*;
public class ArrayDqPrc {
	public static void main(String args[]) {
		Deque <Integer> A =new  <Integer> ArrayDeque();
		Deque  <Integer> B=new <Integer> ArrayDeque();
		
		for(int i=1;i<=6;i++) {
			A.addLast(i);
			for(int j=1;j<=4;j++) {
				B.add(i);
			}
		}
		
		A.forEach(i -> System.out.println("A:"+i));
		B.forEach(j -> 
		System.out.println(B.pop()));
		B.forEach(j -> 
		System.out.println(j));
	}

}
