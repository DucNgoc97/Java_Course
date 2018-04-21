package akimkute10.gmail.com;

public class KhachHang {
	private String username;
	private String password;

	public void setusername(String name) {
		username = name;
	}

	public String getusername() {
		return username;
	}

	public void setpassword(String pass) {
		password = pass;
	}

	public String getpassword() {
		return password;
	}

	public KhachHang() {
		username = "abc";
		password = "123";
	}

}
