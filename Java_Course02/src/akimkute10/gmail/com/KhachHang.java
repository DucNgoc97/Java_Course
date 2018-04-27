package akimkute10.gmail.com;

public class KhachHang {
	private String username;
	private String password;

	public void setUsername(String name) {
		username = name;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String pass) {
		password = pass;
	}

	public String getPassword() {
		return password;
	}

	public KhachHang() {
		username = "abc";
		password = "123";
	}

}
