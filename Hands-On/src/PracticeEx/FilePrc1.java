package PracticeEx;
import java.io.*;
public class FilePrc1 {
	public static void main(String args[])throws IOException {
		//File fact=new File("D:\\File-Java\\fact1.txt");
		BufferedReader br;String S;
		try {
			int f=1;
			br=new BufferedReader(new FileReader("D:\\File-Java\\fact1.txt"));
			while((S=br.readLine())!=null) {
				System.out.println(S);
				
				for(int i=1;i<=Integer.parseInt(S);i++)
				{
					f*=i;
				}
				
				
			}
			System.out.println(f);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
