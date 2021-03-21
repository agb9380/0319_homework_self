package s0319;

import java.util.Scanner;

public class IceCreamMarket {

	Scanner sc = new Scanner(System.in);
	
	private IceCream[] IceArr; // 이 배열에 아이스크림명, 아이스크림 가격에 대한 정보를 담을 것임
	private int totalCustomer = 1;
	private int totalIceCream;
	private int totalProfit;

	public int inputNum(String msg) {

		System.out.println(msg);
		int iceNum = sc.nextInt(); // 구입하고 싶은 아이스크림 개수 입력하기
		totalIceCream += iceNum;
		sc.nextLine();
		return iceNum;

	}

	public void iceCreamNum() {

		int icesNum = inputNum("아이스크림 몇 개 구입할래?"); // 구입하고 싶은 아이스크림의 개수를 리턴 받았음

		IceArr = new IceCream[icesNum];

		for (int i = 0; i < IceArr.length; i++) {

			System.out.println((i + 1) + "번"); // 몇 번째 아이스크림인지 순서 출력
			IceArr[i] = new IceCream();

			String name = inputString("아이스크림명: "); // 아이스크림명을 입력받아서 name 변수에 저장
			int price = inputInt("아이스크림 가격: "); // 아이스크림 가격을 입력받아서 price 변수에 저장

			IceArr[i].set(name, price);

			// IceArr[i].name = name; //멤버 변수가 아닌 메소드로 접근할 수 있도록 만듦
			// IceArr[i].price = price;
		}
		// 입력했던 아이스크림명과 아이스크림 가격 출력
		System.out.println("아이스크림명" + "    " + "아이스크림 가격");
		for (int j = 0; j < IceArr.length; j++) {
			System.out.println(IceArr[j].getName() + '\t' + "    " + IceArr[j].getPrice()); // getName(), getPrice()
																							// 메소드가 리턴하는 값으로 입력값을 출력함

		}
		// 계속 구매할건지 물어보고 Y입력하면 위 문장 다시 반복시켜야함, N인 경우 빠져나감--> 총~ n명의 고객이 아이스크림을 구매했습니다.

		reBuy("계속 구매할래?(Y/N): ");

	}

	public void reBuy(String msg) {
		System.out.println(msg);
		char inputYesNo = sc.next().charAt(0);
		if (inputYesNo == 'Y') {
			totalCustomer++;
			iceCreamNum(); // 계속 구매할래? Y =>다시iceCreamNum () 메소드 호출하기
		} else if (inputYesNo == 'N') {
			end();
		}

	}

	public void end() {
		System.out.println("총 " + totalCustomer + "명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림의 총 개수: " + totalIceCream + "개");
		System.out.println("총 판매액: " + totalProfit + "원");
	}

	public String inputString(String msg) {

		System.out.println(msg);
		String IceName = sc.nextLine();
		return IceName;
	}

	public int inputInt(String msg) {

		System.out.println(msg);
		int IcePrice = sc.nextInt();
		totalProfit += IcePrice;
		sc.nextLine();
		return IcePrice;
	}

}