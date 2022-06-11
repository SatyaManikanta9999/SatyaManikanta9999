
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufferdemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a value");
		String str=br.readLine();
		//int str=Integer.parseInt(br.readLine());
		System.out.println("enter the value is "+str);

	}

}
