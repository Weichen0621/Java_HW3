package pe;

public class Company {
	private int sum = 0;
	
	//執行緒未同步(synchronize)會使程序同時執行導致錯誤
	/*
	public void add(int a) {
		int tmp = sum;
		
		System.out.println("目前的合計金額是" + tmp + "元");
		System.out.println("賺到" + a + "元了");
		
		tmp = tmp + a;
		
		System.out.println("合計金額是" + tmp + "元");
		
		sum = tmp;
	}
	*/
	
	public synchronized void add(int a) {
		int tmp = sum;
		
		System.out.println("目前的合計金額是" + tmp + "元");
		System.out.println("賺到" + a + "元了");
		
		tmp = tmp + a;
		
		System.out.println("合計金額是" + tmp + "元");
		
		sum = tmp;
	}
}
