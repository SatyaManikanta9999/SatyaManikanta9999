package constructor;

public class democons {
	int num,num1,num2;
	 public democons()
	 {
		 num=7;
	 }
	 public democons(int num,int num1)
	 {
		 num=num;
		 num1=num1;
	 }
	public democons(int n,int j,int k)
	{
		num=n;
		num1=j;
		num2=k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		democons obj=new democons(7,9);
		 System.out.println("the value of num"+obj.num);
		 System.out.println("the value of num"+obj.num1);
		 System.out.println("the value of num"+obj.num2);
		}
	}


