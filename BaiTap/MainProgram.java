package akimkute05.gmail.com;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		int luachon;
		ArrayList<Student> listSt = new ArrayList<>();
		Students students = new Students();
		listSt.add(new Student("N01", "La Thị B", 1999, false));
		listSt.add(new Student("N02", "Trần Liên", 1999, true));
		listSt.add(new Student("N03", "Nguyễn Thị Nai", 1998, false));
		listSt.add(new Student("N04", "Nguyễn C", 1998, true));
		listSt.add(new Student("N05", "Trần Trung", 1997, false));
		students.setSt(listSt);

		ArrayList<Employer> listEm = new ArrayList<>();
		Employers employers = new Employers();
		listEm.add(new Employer("C01", "Hoàng Bảo", 1997, true, 2));
		listEm.add(new Employer("C02", "Nguyễn Thị Cẩm", 1996, true, 8));
		listEm.add(new Employer("C03", "Trần Hàm", 1996, true, 4));
		listEm.add(new Employer("C04", "Lê Thị Đào", 1995, true, 6));
		listEm.add(new Employer("C05", "Hồ Chí ", 1996, true, 10));
		employers.setEm(listEm);
		;

		do {
			System.out.println("1. Tìm theo tên Học Sinh");
			System.out.println("2. Tìm theo tuổi Học Sinh");
			System.out.println("3. Tìm theo giới tính Học Sinh Nam");
			System.out.println("4. Tìm theo giới tính Học Sinh nữ");
			System.out.println("5. Tìm nhân viên theo lương");
			System.out.println("6. Thoát chương trình");
			System.out.println("Nhập lựa chọn");
			luachon = new Scanner(System.in).nextInt();

			switch (luachon) {
			case 1:
				System.out.println("Nhập vào tên cần tìm kiếm");
				String ten = new Scanner(System.in).nextLine();
				System.out.println(students.TimKiem(ten));
				break;

			case 2:
				System.out.println("Nhập số đầu");
				int from = new Scanner(System.in).nextInt();
				System.out.println("Nhập số cuối");
				int to = new Scanner(System.in).nextInt();
				System.out.println(students.TimKiem(from, to));
				break;
			case 3:
				System.out.println("Các học sinh có giới tính nam là: \n");
				System.out.println(students.TimKiem(true));

				break;
			case 4:
				System.out.println("Các học sinh có giới tính nữ là: \n");
				System.out.println(students.TimKiem(false));
				break;
			case 5: {
				System.out.println("Nhập số đầu");
				int from1 = new Scanner(System.in).nextInt();
				System.out.println("Nhập số cuối");
				int to1 = new Scanner(System.in).nextInt();
				System.out.println(employers.TimKiem(from1, to1));
				break;
			}
			}
			if (luachon == 6)
				break;
		} while (true);
	}

}