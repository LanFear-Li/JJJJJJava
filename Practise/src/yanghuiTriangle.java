public class yanghuiTriangle {
	public static void main(String[] args) {
		int[][] num = new int[16][16];
		num[1][1] = 1;
		for(int i = 2;i <= 15;i++) {
			for(int j = 1;j <= i;j++) {
				if(j == 1 || j == i)num[i][j] = 1;
				else {num[i][j] = num[i - 1][j] + num[i - 1][j - 1];}
			}
		}
		
		for(int i = 1;i <= 15;i++) {
			for(int j = 1;j <= i;j++)System.out.print(num[i][j] + " ");
			System.out.println();
		}
	}
}
