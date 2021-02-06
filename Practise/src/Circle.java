public class Circle {
	//类成员变量
	int x,y;
	double radius;
	
	//类构造方法
	public Circle() {
		setRadius(0.0);
	}
	public Circle(double r,int a,int b) {
		setRadius(r);
		 x = a;
		 y = b;
	}
	
	//类成员方法
	public void setPoint(int a,int b) {
		x = a;
		y = b;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public double  getRadius() {return radius;}
	
	//类功能方法（实例化方法 不需传参）
	public double area() {
		return Math.PI * radius * radius;
	}
	
	//main方法
	public static void main(String[] args) {
		Circle c = new Circle(10.0,2,3);
		System.out.println(c.getRadius());
		System.out.println(c.area());
		System.out.println(c.getX());
		System.out.println(c.getY());
	}
}
