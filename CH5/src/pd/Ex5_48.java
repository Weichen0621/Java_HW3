package pd;

public class Ex5_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("1號車");
		car1.start();
		
		try {
			car1.join(); //中斷現在在處理的執行緒，直到car1執行緒處理完才繼續執行
		} catch(InterruptedException e) {
				
		}
		
		System.out.println("結束main()的處理工作");
	}

}
