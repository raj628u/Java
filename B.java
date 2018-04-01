class B
	{  
		void m2(Method m1)
	{
		byte b=10;
		m1.m1(b);
		//m1.m2(2);
		//m1.m2(2f);
		//m1.m2(2.3f,3);
		//m1.m3(2,3,4,2,1,3,3,2,2,1,3,3,1,23,2,312,31,312,3,12,312,3,12,31,23,21,312,3,21,31);
		Method m= new Method();
		m.m1(b);
		m.m2(2);
		m.m2(2f);
		m.m2(2.3f,3);
		m.m3(2,3,4,2,1,3,3,2,2,1,3,3,1,23,2,312,31,312,3,12,312,3,12,31,23,21,312,3,21,31);
		System.out.println(m1);
			System.out.println(m);
		System.out.println("m2 invoked as integer");
	}
  
	}  
	