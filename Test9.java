class Test2{
	
	
	public static void main(String[] args){
		int[] ar={10,178,152,153,184,145};
		int temp=0;
		for(int i=0;i<ar.length-1;i++){
				for(int j=0;j<ar.length-1;j++){
					if(ar[j]>ar[j+1]){
						temp=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=temp;
					}
				}
			}
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
		int a=ar[ar.length-1];
		int b=ar[ar.length-2];
		int c=ar[ar.length-3];
		System.out.println("The sum of the three largest numbers is"+(a+b+c));
		}
		
		
	
	}
