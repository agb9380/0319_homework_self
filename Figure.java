package s0319;

import java.util.Random;
import java.util.Scanner;

public class Figure {

	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	int randomNum1;
	int randomNum2;

	final double PI = 3.14;

	void Rectangle() {
		randomNum1 = (int) ((Math.random() * (10 - 2)) + 2); // Random하게 2~10사이의 수 2개 출력
		randomNum2 = (int) ((Math.random() * (10 - 2)) + 2);
		System.out.println("가로 " + randomNum1 + ", 세로 " + randomNum1 + "의 직사각형 면적은 " + randomNum1 * randomNum1 + "입니다.");
	}

	void selcetFigure() {
		System.out.println("도형을 선택하세요(1.직사각형, 2.정사각형 3.삼각형, 4.원)");
		int selectNum = sc.nextInt();

		if (selectNum == 1) {
			Rectangle();

		} else if (selectNum == 2) {
			randomNum1 = (int) ((Math.random() * (10 - 2)) + 2);
			System.out.println("가로 " + randomNum1 + "의 정사각형 면적은 " + randomNum1 * randomNum1 + "입니다.");

		} else if (selectNum == 3) {
			randomNum1 = (int) ((Math.random() * (10 - 2)) + 2); // 밑변과 높이 Random하게 2~10사이의 수 2개 출력
			randomNum2 = (int) ((Math.random() * (10 - 2)) + 2);
			System.out.println("밑변 " + randomNum1 + ", 높이 " + randomNum2 + "의 삼각형의 면적은 "
					+ (int) (randomNum1 * randomNum2 * 0.5) + "입니다.");
		} else if (selectNum == 4) {
			randomNum1 = (int) ((Math.random() * (10 - 2)) + 2);
			System.out.println("반지름이 " + randomNum1 + "인 원의 면적은 " + randomNum1 * randomNum1 * PI + "입니다.");
		}else {
			selcetFigure();
		}

	}
	
}
