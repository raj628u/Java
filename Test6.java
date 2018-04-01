class Test6
{
public static void main(String []s)
{
	Person p= new Panku();
	p.m1();
	p.m2();
	//p.m3();
	System.out.println(p.x);
	
	Panku p2=(Panku)p;
	p2.m1();
	p2.m2();
	p2.m3();
		System.out.println(p2.x);

	Panku p1= new Panku();
	p1.m1();
	p1.m2();
	p1.m3();
	System.out.println(p1.x);
	}}