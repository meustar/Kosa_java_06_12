package ch02.sec02;

public class CharExample {

	public static void main(String[] args) {
		
		char c1 = 'A';		// 문자 저장
		char c2 = 65;		// 유니코드 직접 저장
		
		char c3 = '가';		// 문자 저장
		char c4 = 44032;	// 유니코드 직접 저장
		
//		char c5 = '';		// 빈 문자를 대입하면 "컴파일"에러 발생
		char c6 = ' ';		// 공백 하나를 포함해서 초기화
		char c7 = 32;		// 공백의 유니코드
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
//		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);

	}

}
