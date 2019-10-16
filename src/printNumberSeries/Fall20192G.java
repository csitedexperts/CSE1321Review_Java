package printNumberSeries;

public class Fall20192G {

	public static void main(String[] args) {
		for (int i = 15625; i>=5; i =  (int)Math.sqrt(i)) {
			System.out.print(i + " ");
			if (i == 125)
				i = 625;

		}
	}

}
