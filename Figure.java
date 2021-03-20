package testPackage;

import java.util.Random;
import java.util.Scanner;

public class Figure {

	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	static final int PI = 3;

	public int execution() {

		System.out.println("도형을 선택하세요(1.직사각형, 2.정사각형 3.삼각형, 4.원)");
		int selectNum = sc.nextInt();
		return selectNum;
	}

	public void R_T_Calculaor(int a, int b) { // 여기서 int a, int b는 2~10사이의 난수임 직사각형은 인자 2개
		System.out.println("가로 " + a + ", 세로 " + b + "의 직사각형 면적은 " + a * b + "입니다.");

	}

	public void S_R_Calculaor(int a) { // 정사각형의 면적
		System.out.println("가로 " + a + "의 정사각형 면적은 " + a * a + "입니다.");
	}

}

class Figure2 extends Figure {

	@Override
	public void R_T_Calculaor(int a, int b) {
		System.out.println("밑변 " + a + ", 높이 " + b + "의 삼각형의 면적은 " + (int) (a * b * 0.5) + "입니다.");
	}

	@Override
	public void S_R_Calculaor(int a) {
		System.out.println("반지름이 " + a + "인 원의 면적은 " + a * a * Figure.PI + "입니다.");
	}

	public int CreateR() {
		int randomNum = (int) ((Math.random() * (10 - 2)) + 2);
		return randomNum;
	}

	public void info(int selectNum) {
		if (selectNum == 1) {
			super.R_T_Calculaor(CreateR(), CreateR()); // 자식 클래스에서 부모 클래스의 메소드 호출
		} else if (selectNum == 2) {
			super.S_R_Calculaor(CreateR());
		} else if (selectNum == 3) {
			R_T_Calculaor(CreateR(), CreateR());
		} else if (selectNum == 4) {
			S_R_Calculaor(CreateR());
		}
	}

}
