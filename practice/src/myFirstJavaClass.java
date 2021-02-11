class test {
	private int num;

	public test() {
		num = 2;
	}

	public test(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void changeData(int num) {
		this.num = num;
	}
}

public class myFirstJavaClass {

	public static void main(String[] args) {
		test xxx = new test(3);
		System.out.println(xxx.getNum());
	}
}
