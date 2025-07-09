package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0;
//		double z = x / y;		// infinity
		double z = x % y;		// NaN
		
		System.out.println(z + 2);
		
		boolean result1 = Double.isInfinite(z);
		boolean result2 = Double.isNaN(z);
		
		System.out.println(z);
		System.out.println(result1);
		System.out.println(result2);

		System.out.println("------------------------------");
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}
	}

}
