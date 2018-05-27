package akimkute05.gmail.com;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		int luachon;
		ArrayList<Student> listSt = new ArrayList<>();
		Students students = new Students();
		listSt.add(new Student("N01", "La Th? Bê", 1994, false));
		listSt.add(new Student("N02", "Hoa Van Lam", 1999, true));
		listSt.add(new Student("N03", "Nguy?n Van A", 1996, false));
		listSt.add(new Student("N04", "Cao Chí B", 1998, true));
		listSt.add(new Student("N05", "Hu?nh Th? C", 1997, false));
		students.setSt(listSt);

		ArrayList<Employer> listEm = new ArrayList<>();
		Employers employers = new Employers();
		listEm.add(new Employer("N01", "Tr?n Th? Ðào", 1997, fasle, 2));
		listEm.add(new Employer("N02", "Lê Th? M?n", 1996, true, 8));
		listEm.add(new Employer("N03", "Nguy?n Chí Quang", 1996, true, 4));
		listEm.add(new Employer("N04", "Nguyê~n Thê´ Thanh", 1995, true, 6));
		listEm.add(new Employer("N05", "Tr?n Cao", 1995, true, 10));
		employers.setEm(listEm);
		;

		do {
			System.out.println("1. Tìm theo tên H?c Sinh");
			System.out.println("2. Tìm theo tu?i H?c Sinh");
			System.out.println("3. Tìm theo gi?i tính H?c Sinh Nam");
			System.out.println("4. Tìm theo gi?i tính H?c Sinh n?");
			System.out.println("5. Tìm nhân viên theo luong");
			System.out.println("6. Thoát chuong trình");
			System.out.println("Nh?p l?a ch?n");
			luachon = new Scanner(System.in).nextInt();

			switch (luachon) {
			case 1:
				System.out.println("Nh?p vào tên c?n tìm ki?m");
				String ten = new Scanner(System.in).nextLine();
				System.out.println(students.TimKiem(ten));
				break;

			case 2:
				System.out.println("Nh?p s? d?u");
				int from = new Scanner(System.in).nextInt();
				System.out.println("Nh?p s? cu?i");
				int to = new Scanner(System.in).nextInt();
				System.out.println(students.TimKiem(from, to));
				break;
			case 3:
				System.out.println("Các h?c sinh có gi?i tính nam là: \n");
				System.out.println(students.TimKiem(true));

				break;
			case 4:
				System.out.println("Các h?c sinh có gi?i tính n? là: \n");
				System.out.println(students.TimKiem(false));
				break;
			case 5: {
				System.out.println("Nh?p s? d?u");
				int from1 = new Scanner(System.in).nextInt();
				System.out.println("Nh?p s? cu?i");
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