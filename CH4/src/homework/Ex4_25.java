package homework;

import java.io.*;

public class Ex4_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car();
		
		Car car3;
		car3 = car1;
		
		System.out.println("car1與car2相同" + car1.equals(car2));
		System.out.println("car1與car3相同" + car1.equals(car3));
	}

}
