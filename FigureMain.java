package testPackage;

public class FigureMain {

	public static void main(String[] args) {

		Figure a = new Figure();
		Figure2 b = new Figure2();

		int selectNum = a.execution();
		b.info(selectNum);

	}
}