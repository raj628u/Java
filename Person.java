abstract class Person{
	int x=10;
abstract void m1();
void m2()
{
	System.out.println("eating");
}
}

class Panku extends Person{
	String x="Pankaj Mathur";
	void m1()
	{
	System.out.println("Bathing is crime");	
	}
	
	void m3(){
		System.out.println("Sona hamara Janm Sidh Adhikaar h: Panku ");
	}
}