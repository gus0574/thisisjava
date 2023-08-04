package ch19_네트워크.sec02_IP주소얻기;

import java.net.InetAddress;

public class InetAddressExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP : " + local.getHostAddress());
			
			//도메인주소로 DNS에 접근하여 네이버의 HOST IP 주소를 얻어냄
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com의 IP : " + remote.getHostAddress());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
