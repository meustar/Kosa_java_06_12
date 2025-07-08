package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		
		byte value1 = 127;
		value1++;						// value1 값에 1을 더함
		System.out.println(value1);		//  -128
		
		System.out.println("------------------------------");
		
		byte value2 = -128;
		value2--;						// value2 값에 1을 뺌
		System.out.println(value2); 	// 127
	
		System.out.println("------------------------------");
		
		byte var1 = 125;
		for(int i = 0; i < 5; i++ ) {	// { }를 5번 반복 실행
			var1++;						// ++ 연산은 var1의 값을 1 증가시킨다.
			System.out.println("var1: " + var1);
		}
		
		System.out.println("------------------------------");
		
		byte var2 = -125;
		for(int i = 0; i < 5; i++ ) {	// { }를 5번 반복 실행
			var2--;						// ++ 연산은 var1의 값을 1 감소시킨다.
			System.out.println("var2: " + var2);
		}
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);	// -727379968
		
		
		long a = 1000000;
		long b = 1000000;
		long c = a * b;
		System.out.println(c);	// 1000000000000
	}
}
