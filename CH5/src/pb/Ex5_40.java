package pb;

import java.io.*;

//範例中的文字檔必須先建立好，路徑: 專案名稱按右鍵 -> file -> 在file name取好名即可

public class Ex5_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("請指定正確的檔案名稱");
			System.exit(1);
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			String str;
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			br.close();
		} catch (IOException e) {
			System.out.println("輸出入錯誤");
		}
	}

}
