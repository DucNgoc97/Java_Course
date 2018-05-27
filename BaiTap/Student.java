package akimkute05.gmail.com

import java.time.ZoneId;
import java.util.Date;

public class Student {
	private String ma;
	private String hoten;
	private int namsinh;
	private boolean gioitinh;

	public int tinhTuoi() {
		return (new Date().toInstant().atZone(ZoneId.systemDefault()).getYear() - namsinh);
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public boolean getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public Student(String ma, String hoten, int namsinh, boolean gioitinh) {
		this.ma = ma;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
	}

	@Override
	public String toString() {
		return "Sinh viên : \n" + "Mã sv : " + ma + "\n Họ tên : " + hoten + "\n Năm sinh : " + namsinh
				+ "\n Giới tính : " +((gioitinh)?"Nam":"Nữ");
	}
}