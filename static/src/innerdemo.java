class outer
{
		public void show()
		{
			System.out.println("outer class");
		}
		static class inner
		{
			public void display()
			{
				System.out.println("inner class");
			}
		}
}
public class innerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer ob=new outer();
		ob.show();
		
		outer.inner obj=new outer.inner();
	}

}
