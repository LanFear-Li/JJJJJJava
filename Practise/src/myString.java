public class myString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		String str1 = new String("11ABC");
		String str2 = new String("11abc");
		
		if(str1.equalsIgnoreCase(str2))System.out.println("hhh");
		
		System.out.println(str + str.length());
		str = "hello!";
		System.out.println(str + str.length());
		str = "hh";
		System.out.println(str + str.length());
		
		String x = new String("hello");

		System.out.println(x.length() + "*" + x.toString());
		x = "hello!!";
	}
}
