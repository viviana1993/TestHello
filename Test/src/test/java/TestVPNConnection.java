import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestVPNConnection {

	//	public static void main(String[] args) {
	//
	//		
	//
	//		List<String> networkList = new ArrayList<String>();
	//		try {
	//			for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
	//				if (networkInterface.isUp())
	//					networkList.add(networkInterface.getName());
	//			}
	//		} catch (Exception ex) {
	//			ex.printStackTrace();
	//			
	//			//("isVpnUsing Network List didn't received");eth0
	//		}
	//
	//		if (networkList.contains("lo"))
	//			System.out.println("contains");
	//		else System.out.println("not contains");
	//	}



	public static void main(String[] args) {



		List<String> networkList = new ArrayList<String>();
		try {
//			for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
//				if (networkInterface.isUp())
//					networkList.add(networkInterface.getName());
//			}
			if (NetworkInterface.getByName("eth0")!=null && NetworkInterface.getByName("eth0").isUp())
				System.out.println("connessione verificata");
			else System.out.println("non verificata");	
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}


}
