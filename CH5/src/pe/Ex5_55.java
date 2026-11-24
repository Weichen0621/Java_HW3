package pe;

public class Ex5_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company cmp = new Company();
		
		Driver drv1 = new Driver(cmp);
		drv1.start();
		
		Driver drv2 = new Driver(cmp);
		drv2.start();
	}

}
