package pb;

import pc.Car;
import pc.CarException;

public class Ex5_32 {

	public static void main(String[] args) throws CarException {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		
		car1.setCar(1234, -10.0);
		
		car1.show();
	}

}
