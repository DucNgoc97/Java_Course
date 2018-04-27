package akimkute05.gmail.com;

import java.util.Scanner;

public class KhachHang {
	private String username;
	//Tiếp tục cho các thuộc tính khác

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String usn) {
		username = usn;
	}
	//Tiếp tục cho các phương thức

	public String getPassword() {
		return password;
	}

	public void setPassword(String pw) {
		password = pw;
	}

	public KhachHang(String name, String pw) {
		username = name;
		password = pw;
	}

	public KhachHang() {
		username = "admin"; // khởi tạo username = admin
		password = "123"; // khởi tạo password = 123
	}
	// gán các giá trị cho phiếu mua hàng
	public String MuaHang(String th, String nsx, double dg, int sl) {
			HangHoa hh = new HangHoa();
			hh.setTenHang(th);
			hh.setNgaySanXuat(nsx);
			hh.setDonGia(dg);
			hh.setSoLuong(sl);
			hh.TinhTien();
			return hh.toString();
		}
}
