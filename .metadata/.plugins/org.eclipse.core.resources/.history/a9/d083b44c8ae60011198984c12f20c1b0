package pb;

import java.io.*;

public class Ex5_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("test1.txt"); //將資料輸出成一行，在此指定檔案名稱並建立將資料輸出到檔案文字串流
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("GoodBye!");
			
			pw.close(); //關閉檔案
			
			System.out.println("資料已經寫入檔案了");
		} catch(IOException e) {
			System.out.println("輸出入錯誤");
		}
	}

}
