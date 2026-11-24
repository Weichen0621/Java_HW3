package homework;

import java.io.*;

public class Ex4_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car2(1234, 20.5);
		vc[0].setSpeed(60);
		
		vc[1] = new Plane(232);
		vc[1].setSpeed(500);
		
		for(int i = 0; i < vc.length; i++) {
			vc[i].show();
		}
	}

}
