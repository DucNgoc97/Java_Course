papackage akimkute05.gmail.com;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		String mua = new String();
		KhachHang kh = new KhachHang();
		// Tiếp tục với các yêu cầu của đề bài
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Mời bạn nhập username");
		String usn = sc.nextLine();
		System.out.println("Mời bạn nhập password");
		String pass = sc.nextLine();
		if (usn.equals(kh.getUsername()) && pass.equals(kh.getPassword())) {
			do {
				System.out.println("Bạn có muốn mua hàng");
				System.out.println("1. Có");
				System.out.println("2. Không");
				n = sc.nextInt();
				if (n == 1) {
					Scanner sc1 = new Scanner(System.in);
					System.out.println("Nhập tên hàng");
					String ten = sc1.nextLine();
					System.out.println("Nhập ngày sản xuất");
					String ngaysx = sc1.nextLine();
					System.out.println("Nhập số lượng");
					int sl = sc1.nextInt();
					System.out.println("Nhập Đơn giá");
					double dg = sc1.nextDouble();
					mua += "\n------\n" + kh.MuaHang(ten, ngaysx, dg, sl);
				} else
					System.out.println(mua);
			} while (n == 1);
		} else
			System.out.println("tài khoản của quý khách không tồn tại trong hệ thống."
					+ " Xin liên hệ chi nhánh khách hàng gần nhất");
	}
}
