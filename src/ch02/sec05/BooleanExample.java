package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		
		int x = 10;
		boolean result1 = (x == 20);			// 변수 x의 값이 20 인가?						false
		boolean result2 = (x != 20);			// 변수 x의 값이 20이 아닌가?					true
		boolean result3 = (x > 20);				// 변수 x의 값이 20보다 큰가?					false
		boolean result4 = (0 < x && x < 20);	// 변수 x의 값이 0보다 크고, 20보다 작은가?		true
		boolean result5 = (x < 0 || x > 200);	// 변수 x의 값이 0보다 작거나,  200보다 큰가?	false
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		//-------------------------------------------
		
		boolean stop  = true;
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		int y = 10;
		boolean result6 = (y == 20);			// 변수 y의 값이 20 인가?
		boolean result7 = (y != 20);			// 변수 y의 값이 20이 아닌가?
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);

	}

}
