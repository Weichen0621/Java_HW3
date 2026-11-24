package pe;

public class Ex5_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company cmp = new Company();
		
		//兩名駕駛同時使用Company裡的add()的方法會導致錯誤的結果
		Driver drv1 = new Driver(cmp);
		drv1.start();
		
		Driver drv2 = new Driver(cmp);
		drv2.start();
	}

}
