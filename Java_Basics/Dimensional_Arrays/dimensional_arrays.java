class Array {
	public static void main(String args[]) {
		int twoD[][] = new int[10][15];
		int i, j, k = 0;

		for(i = 0; i < 10; i++)
			for(j = 0; j < 15; j++) {
				twoD[i][j] = k;
				k++;
			}

		for(i = 0; i < 10; i++)
			for(j = 0; j < 15; j++){
				System.out.println(twoD[i][j] + "");
			System.out.println();
			}

	int[] a = new int [10];
	int p;

	for(p = 0; p < a.length; p++) {
		System.out.println("Elements:" +p);
	}

	String str = "This is an introduction to Strings";
	System.out.println(str);
	
	}

}
