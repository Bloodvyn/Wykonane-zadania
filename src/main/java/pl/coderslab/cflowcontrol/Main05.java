package pl.coderslab.cflowcontrol;

public class Main05 {

	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;
				for (int i = 0; i < 11; i++ ) {
					resultFor += i;
				}
				System.out.println(resultFor);

				int k= 1;
				while (k < 11) {
					resultWhile += k;
					k++;
				}
				System.out.println(resultWhile);
	}

}
