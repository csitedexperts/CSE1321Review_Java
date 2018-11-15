package test2_Questions;

public class PrintNumbers99 {
	public static void main(String[] args) {
		int inc = 0;
		for (int num = 8; num<= 62; num = num + inc)
		{
			for(inc = 4; inc<=14; inc = inc+ 2) {
				System.out.print(num + "  ");
			}
		}
	}

}
