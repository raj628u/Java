class Method
{
	static void m1(byte b)
	{
		System.out.println(b);
		return;
	}
	
	
	 int m2(int a)
	{
		System.out.println("m2 invoked as integer");
		return 1;
	}
	
	int m2(float c)
	{
		System.out.println("m2 invoked as float");
		return 1;
	}

	int m2(float c,int a)
	{
		System.out.println("m2 invoked as float");
	
	return a;
	}
	
	/*void m3(int... r)
	{
		System.out.println("m3 invoked For Var Ars");
		for(int ar:r)
		{
			System.out.println(ar);
		}
	}*/
	
	void m3(int x,int... r)
	{
		System.out.println("m3 invoked For Var Ars");
		for(int ar:r)
		{
			System.out.println(ar);
		}
	}
	
	
	}
	
	
	