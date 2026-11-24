package practice;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//可直接掃描輸入的內容，不必像之前:
		//String str = br.readLine();
		//int num = Integer.parseInt(str);
		Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name：");
        String name = sc.nextLine();

        System.out.print("Please enter your age：");
        int age = sc.nextInt();

        System.out.println("Name：" + name);
        System.out.println("Age：" + age);

        sc.close();
	}

}
