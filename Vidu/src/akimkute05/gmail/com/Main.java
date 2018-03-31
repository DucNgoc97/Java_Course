package akimkute05.gmail.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String a = buf.readLine();
		String b = buf.readLine();
		float c = Float.parseFloat(a);
		float d = Float.parseFloat(b);
		System.out.println("minh la ket qua " + "\n"+ (c + d));

	}
}
