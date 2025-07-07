package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;	// +1 증가
		++x;	// +1 증가
		System.out.println("x= " + x);	// x = 12
		
		System.out.println("-------------------------");
		
		y--;	// -1 감소
		--y;	// -1 감소
		System.out.println("y= " + y);	// y = 8

		System.out.println("-------------------------");
		
		z= x++;	
		System.out.println("z= " + z);	// z = 12
		System.out.println("x= " + x);	// x = 13	(후위 증감으로 인해 대입연산자 후 증가함.)
		
		System.out.println("-------------------------");
		
		z= ++x;	// 13 + 1 = 14
		System.out.println("z= " + z);	// z = 14
		System.out.println("x= " + x);	// x = 14	(전위 증감으로 인해 대입연산자에 할당하기 전 증가 먼저)
		
		System.out.println("-------------------------");
		
		z = ++x + y++;		// 전위연산 x = 15 , +  y = 8
		System.out.println("z= " + z);	// z = 23
		System.out.println("x= " + x);	// x = 15
		System.out.println("y= " + y);	// y = 9
		
	}

}
