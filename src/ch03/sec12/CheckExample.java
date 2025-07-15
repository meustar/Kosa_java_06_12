package ch03.sec12;

public class CheckExample {

	public static void main(String[] args) {
		
		// p109
		
		// 1. 다음 코드를 실행했을 때 출력 결과를 작성해 보시오.
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);		// x = 11 y =20  => 연산 후 y = 19
		System.out.println(z);		// z = 31
		
		System.out.println("---------------------------------------------------------------------");
		// 2. 다음 코드를 실행했을 때 출력 결과를 작성해 보시오.
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";	// (!(false)) => (true) ? "가" : "나"
		System.out.println(result);	// "가"
		
		
		System.out.println("---------------------------------------------------------------------");
		
		/* 3. 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 1인당 몇개를 가질 수 있고, 
		 * 마지막에 몇 개가 남는지를 구하는 코드이다. ( )에 들어갈 알맞는 코드를 차례대로 작성하시오.
		 */ 
		
		int pencils = 534;
		int student = 30;
		
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (pencils / student);
		System.out.println("한명 당 가지는 연필 갯수 : " + pencilsPerStudent);
		
		// 남은 연필 수
		int pencilsLeft = (pencils % student);
		System.out.println("나누고 남은 연필 수 : " + pencilsLeft);
		
		
		System.out.println("---------------------------------------------------------------------");
		
		
		/* 4. 다음은 십의 자리 이하를 버리는 코드입니다. 변수 value의 값이 356이라면 300이 나올 수 있도록 ( )
		 *  에 알맞은 코드를 작성하세요.(산술 연산자만 사용)
		 */
		
		int value = 356;
		System.out.println( (value / 100) * 100);	// 356/100 = 3, 3 * 100 = 300
		
		System.out.println("---------------------------------------------------------------------");
		
		/* 5. 다음 코드는 사다리꼴의 넓이를 구하는 코드입니다. 정확히 소수 자릿수가 나올 수 있도록 ( )에
		 *  들어갈 수 있는 코드를 모두 선택하세요.
		 *
		 *	정답 = 1, 2, 3
		 */
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
//		double area = (lengthTop + lengthBottom) * height / 2.0;
//		double area = (lengthTop + lengthBottom) * height * 1.0 / 2;
//		double area = (double)(lengthTop + lengthBottom) * height / 2;
		double area = (double)((lengthTop + lengthBottom) * height / 2);	// 이미 int로 나누고 double로 형변환을 해서 소숫점만 생길뿐이다.
		System.out.println(area);
		
		
		System.out.println("---------------------------------------------------------------------");
		
		// 6. 다음 코드는 비교 연산자와 논리 연사자의 복합 연산식입니다. 연산식의 출력 결과를 작성해 보세요.
		
		int a = 10;
		int b = 5;
		
		System.out.println( (a > 7) && (b <= 5) );				// true
		System.out.println( (a % 3 == 2) || (b % 2 != 1) );		// false
		
		System.out.println("---------------------------------------------------------------------");
		
		/* 7. 다음은 % 연산을 수행한 결과값에 10을 더하는 코드입니다. NaN 값을 검사해서 올바른 결과가
		 *  출력될 수 있도록 ( )에 들어갈 코드를 작성해 보세요.
		 **/
		
		double xx = 5.0;
		double yy = 0.0;
		double zz = 5 % yy;
		
		if (Double.isNaN(zz)) {
			System.out.println("0.0 으로 나눌 수 없습니다.");
		} else {
			double result1 = z + 10;
			System.out.println("결과: " + result1);
		}
	}

}
