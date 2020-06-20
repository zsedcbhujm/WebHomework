public class Fibnoacci {
	public static void main(String[] args) {
		for (int i = 1; i <= 200; i++)
			System.out.println(Fibnoacci.of(i));
	}

	public static int of(int index) {
		if (index == 1) 
			return 1;
		else if (index == 2)
			return 1;
		else
			return Fibnoacci.of(index - 2) + Fibnoacci.of(index - 1);
	}
}
