package homework;

import java.io.*;

public class Ex4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new RacingCar(); //從父類別的變數操作子類別的物件，但沒辦法呼叫子類別自己新增的物件
								//因為是以Car類別的變數存取，所以只能對Car類別有的方法存取
		car1.setCar(1234, 20.5);
		
		car1.show(); //但由結果可知，還是會呼叫出子類別的show()，因為要呼叫哪個方法與類別本身無關，但和new的物件有關
	}

}
