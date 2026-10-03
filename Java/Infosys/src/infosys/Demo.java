package infosys;

public class Demo {
	public void changeValue(int value1, int value2) {
		value1 = value1 + value2;
		value2 = value1 - value2;
		System.out.println(value1 + " " + value2);
	}
	public static void main(String args[]) {
		Demo demo = new Demo();
		int x = 20;
		int y = 10;
		System.out.println(x + " " + y);
		demo.changeValue(x, y);
		System.out.println("After calling changeValue function");
		System.out.println(x + " " + y);
	}
}

