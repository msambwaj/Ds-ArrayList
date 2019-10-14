package dataStructures;

class Data {
	
	public static Comparable findMax(Comparable[] arr) {
		int maxIndex = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(arr[maxIndex]) > 0) {
				maxIndex = i;
			}
		}
		
		
		return arr[maxIndex];
	}
	
	//gdc
	public static long gcd(long m, long n) {
		long temp;
		if (m < n) {
			temp = m;
			m = n;
			n= temp;
		}
		while (n != 0) {
			long rem = m % n;
			m = n;
			n = rem;
		}
		return m;
	}

	public static void main(String[] args) {
		
		
//		Integer[] str1 = {662,463,45,989,623,4254, 2242,634};
//		
//		System.out.println(findMax(str1));
		
		System.out.println(gcd(632430, 3248232));
		
	}
	
	
}
