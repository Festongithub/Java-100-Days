class BitWise{
	public static void main(String args[]) {
		int i = 42;
		int j = 15;
		int a = 3;
		int h = i ^ j;
		int k = i | j;
		int g = i & 0x0f;
		int b = j >> a;
		int c = j << a;

		System.out.println("New answer is: " + h);
		System.out.println("Or is it: " +k);
		System.out.println("And is: " + g);
		System.out.println("Left shift is:" +b);
		System.out.println("Right shift is: " +c);
	}
}
