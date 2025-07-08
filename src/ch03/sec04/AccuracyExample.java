package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		
		/* result 변수의 값은 정확히 0.3이 되지 않는다.
		 * 이것은 부동 소수점 방식을 사용하는 실수 타입에서 흔히 일어난다.
		 * 그렇기 때문에 정확한 계산이 필요하다면 정수 연산으로 변경해서 계산하는 것이 좋다.
		 */

	}

}
