import java.util.Scanner;
//import java.io.*;

public class mySecondJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入华氏温度："); 
		int get_num = sc.nextInt();
		double res = 5 * (get_num - 32) / 9.0;
		System.out.println("对应的摄氏温度为："); 
		System.out.println(res);
		sc.close();
	}
}
