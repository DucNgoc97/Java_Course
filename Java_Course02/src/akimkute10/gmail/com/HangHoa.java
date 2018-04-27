package akimkute10.gmail.com;

public class HangHoa {
	private String tenHang;
	private String ngaySanXuat;
	private float donGia;
	private int soLuong;

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String ten) {
		tenHang = ten;
	}

	public void setNgaySanXuat(String ngay) {
		ngaySanXuat = ngay;
	}

	public String getNgaySanXuat() {
		return ngaySanXuat;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float dg) {
		donGia = dg;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int sl) {
		soLuong = sl;
	}

	public HangHoa(String ten, String ngay, float dg, int sl) {
		tenHang = ten;
		ngaySanXuat = ngay;
		donGia = dg;
		soLuong = sl;
	}

	public double tinhTien() {
		return soLuong * donGia;

	}

	public String inThongTin() {
		return "Ten hang hoa " + tenHang + ", Ngay San Xuat : " + ngaySanXuat + ", so luong " + soLuong + ", dongia "
				+ donGia +" Tong tien " + tinhTien;
	}
}
