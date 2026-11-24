package homework;

import java.io.*;

public class Car {
	
	//原先將父類別(Car)內成員設定為private，所以子類別(RacingCar)就無法存取父類別的資料
	//但將成員設定為protected後，子類別就可以正常地存取父類別的資料
	protected int num;
	protected double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		
		System.out.println("生產了車子");
	}
	
	public Car(int n, double g) {
		num = n;
		gas = g;
		
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	public void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
	
	public String toString() {
		String str = "車號:" + num + "，汽油量:" + gas;
		return str;
	}
}
