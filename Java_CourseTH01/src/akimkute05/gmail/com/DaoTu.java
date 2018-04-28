package akimkute05.gmail.com;

public class DaoTu {
	public static String thuchien(String s) {
		String ns = new String();
		char[] s1 = s.toCharArray();
		int count = 0;
		for (int i = 0; i < s1.length; i++){
			if (s1[i] == ' ' || i == 0){
				count++;
			}
		}
		System.out.println(count);
		return ns;
	}
}