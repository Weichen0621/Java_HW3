package homework;

import java.io.*;

public class Ex4_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iVehicle[] ivc;
		ivc = new iVehicle[2];
		
		ivc[0] = new Car3(1234,20.5);
		ivc[1] = new Plane2(232);
		
		for(int i = 0; i < ivc.length; i++) {
			ivc[i].show();
		}
	}

}
