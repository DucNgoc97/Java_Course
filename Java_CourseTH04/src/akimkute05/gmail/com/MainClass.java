package akimkute05.gmail.com;

public class MainClass {

	public static void main(String[] args) {
		HinhKhoi hk = new HinhKhoi(4);
		HinhKhoi1 hk1 = new HinhKhoi1(2, 7);
		HinhKhoi2 hk2 = new HinhKhoi2(3, 1, 3);
		HinhKhoi3 hk3 = new HinhKhoi3(2, 7);
		System.out.println("Hình khối 1 có thể tích = "+hk1.thetich1());
		System.out.println("Hình khối 2 có thể tích = "+hk2.thetich2());
		System.out.println("Hình khối 3 có thể tích = "+hk3.thetich3());	
	}
