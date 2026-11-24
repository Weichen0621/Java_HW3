package practice;

import java.net.InetAddress;

public class NetExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        
		//查www.google.com對應的網路位址
		InetAddress address = InetAddress.getByName("www.google.com");

        System.out.println("Host name：" + address.getHostName());
        System.out.println("IP address：" + address.getHostAddress());
	}

}
