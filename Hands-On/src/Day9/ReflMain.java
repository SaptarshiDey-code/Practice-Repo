package Day9;
import java.lang.reflect.*;
import java.util.*;
public class ReflMain {
	
	public static void main(String args[]) {
		try {
			
		
		Integer a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Two Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		CalcRfl Ob=new CalcRfl();
		CalcRfl obj=new CalcRfl(a,b);
		//Class Cl=Ob.getClass();
		Class Cl=CalcRfl.class;
		Constructor con=Cl.getConstructor();
		
		System.out.println("Constructor Is:"+ con.getName());
		
		Constructor con1=Cl.getConstructor(Integer.class,Integer.class);
		System.out.println(Cl.getName());
		
		Method Add=Cl.getMethod("add",Integer.class,Integer.class);
		System.out.println(Add.invoke(Ob,8,9));
		
		Method Sub=Cl.getMethod("sub", Integer.class,Integer.class);
		System.out.println(Sub.invoke(obj, 10,8));
		
		
		
		}	
		
		catch(IllegalAccessException|IllegalArgumentException|InvocationTargetException|NoSuchMethodException e) {
			
			e.printStackTrace();
		}
		
	}

}
