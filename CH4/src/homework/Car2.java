package homework;

class Car2 extends Vehicle{
	private int num;
	private double gas;
	
	public Car2(int n, double g) {
		num = n;
		gas = g;
		
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	public void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("速度是" + speed);
	}
}
