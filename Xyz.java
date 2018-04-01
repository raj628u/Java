class Xyz
{
	public static void main(String []s)
	{
	String s1 = "abczabcvm";
	char[] ch = s1.toCharAt();
	boolean[] t1 = new boolean[256];
	StringBuilder sb = new StringBuilder();

	for (char c : ch) {
		if (!t1[c]) {
		    t1[c] = true;
		    sb.append(c);
		}
	}
	System.out.println("Duplicated String:  " + sb.toString());
 
	}
}