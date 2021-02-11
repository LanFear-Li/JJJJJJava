public class multiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// this outer sucks...
//		outer:for(int i = 1;i <= 9;i++) {
//			for(int j = 1;j <= 9;j++) {
//				System.out.print(j + "*" + i + "=" + j * i + ' ');
//				if(i == j) {
//					System.out.print('\n');
//					continue outer;
//				}
//			}
//		}

		for(int i = 1;i <= 9;i++) {
			for(int j = 1;j <= 9;j++) {
				System.out.print(j + "*" + i + "=" + j * i + ' ');
				if(i == j) {
					System.out.print('\n');
					break;
				}
			}
		}
	}
}
