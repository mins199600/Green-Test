package taxi;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int distance;
		int price = 900;
		System.out.println("거리를 M(미터) 단위로 입력하세요 : ");
		distance = scanner.nextInt();
		if (distance > 2000) {
			int DT = distance - 2000;	//2000m 초과거리
			price += (DT / 200) * 100;	//200미터당 100원 요금 인상
		}
	
		System.out.println("총 요금은 : " + price + "입니다");
	}

}
