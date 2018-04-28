package akimkute05.gmail.com;

public class HangHoa {
	private String tenhang;
	// Tiếp tục cho các thuộc tính còn lại

	private String ngaysanxuat;
	private double dongia;
	private int soluong;

	public String getTenHang() {
		return tenhang;
	}

	public void setTenHang(String th) {
		tenhang = th;
	}
	// Tiếp tục cho các phương thức còn lại

	public String getNgaySanXuat() {
		return ngaysanxuat;
	}

	public void setNgaySanXuat(String nsx) {
		ngaysanxuat = nsx;
	}

	public double getDonGia() {
		return dongia;
	}

	public void setDonGia(double dg) {
		dongia = dg;
	}

	public HangHoa() { //khai báo hàng hóa để chèn các thuộc tính set ở main
	}

	public int getSoLuong() {
		return soluong;
	}

	public void setSoLuong(int sl) {
		soluong = sl;
	}

	public double TinhTien() {
		return dongia * soluong;
	}

	public HangHoa(String th, String nsx, double dg, int sl) {
		tenhang = th;
		ngaysanxuat = nsx;
		dongia = dg;
		soluong = sl;
	}

	public String toString() {
		return "Tên hàng: " + tenhang + "\n" + "Ngày sản xuất: " + ngaysanxuat + "\n" + "Đơn giá: " + dongia + "\n"
				+ "Số lượng: " + soluong + "\n" + "Thành tiền: " + TinhTien();
	}
}
