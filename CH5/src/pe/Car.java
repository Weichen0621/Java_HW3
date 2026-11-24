package pe;

public class Car implements Runnable{
	private String name;
	
	public Car(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("正在進行" + name + "的處理");
		}
	}
}
