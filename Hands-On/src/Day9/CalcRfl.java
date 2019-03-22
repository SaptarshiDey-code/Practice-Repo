package Day9;
import java.lang.reflect.*;

public class CalcRfl {
	Integer a,b;
public CalcRfl(Integer a,Integer b){
	this.a=a;
	this.b=b;
}
public CalcRfl(){
	
}
	
	public int add(Integer a,Integer b) {
		return a+b;
	}
	public int sub(Integer a,Integer b) {
		return a-b;
	}
	
	public int mul(Integer a,Integer b) {
		return a*b;
	}
	
	public int div(Integer a,Integer b) {
		return a/b;
	}

}
