class Abc
{public  static void main(String []ars)
	{
		String s="rajk";
		String s2=s.toUpperCase();
		char[] ch=s2.toCharArray();  
		int n=ch.length;
		
		for(int i=0;i<n;i++)
		{ if(i%2!=0){
			System.out.print(ch[i]);  
			
		}  
		}

	}
}