class Test3
{
	public static void main(String args[])
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println("\n");
			System.out.println("Table of "+i);
			System.out.println("");
			
			for(int j=1;j<=10;j++)
			{
				int c=i*j;
				
				System.out.println(i+"*"+j+"="+c);
			}
			
		}
	}
}