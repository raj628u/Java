class Test8{
	public static void main(String[] args){
		String s="this is a string";
		char[] c=s.toCharArray();
		char[] c1=new char[s.length()];
		c1[0]=c[0];
		for(int i=1;i<s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				if((c[i]==c1[j]))
				{					
			break;
				}
				else if(c[i]!=c1[j]&&j< i-1){
					continue;
				}
				else{				
					c1[i]=c[i];
				}
				
			}
		}
		for(int i=0;i<c1.length;i++){
			if(c1[i]=='	'){
				continue;
			}
			else{
				System.out.print(c1[i]);
			}
		}
		System.out.println();
	}
}