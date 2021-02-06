class father {
	public father() {
		System.out.println("i am the father!");
	}
}

public class myJavaArray {
	public static final int MAXN = 3;
	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i = 0;i <= 9;i++)num[i] = i;
		for(int i = 0;i <= 9;i++)System.out.println(num[i]);
		father[] arr = new father[MAXN];
		for(int i = 0;i < arr.length;i++)arr[i] = new father();
		int[] a = {1,2,3};
		//int a[] = new int[3];
		int[] b = {4,5,6,7};
		System.out.println(a.length + " " + b.length);
		b = a;

		for(int i = 0;i < a.length;i++)System.out.print(a[i] + " ");
		System.out.print('\n');
		for(int i = 0;i < a.length;i++)System.out.print(b[i] + " ");
		System.out.print('\n');
		b[1] = 10;

		for(int i = 0;i < a.length;i++)System.out.print(a[i] + " ");
		System.out.print('\n');
		for(int i = 0;i < a.length;i++)System.out.print(b[i] + " ");
		System.out.print('\n');
	}
}
