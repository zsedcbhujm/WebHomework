public class Fibnoacci {
	public static void main(String[] args) {
		System.out.println(Fibnoacci.of(3));
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
