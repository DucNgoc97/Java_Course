package akimkute05.gmail.com;

public class TinhTong {
	public static float thuchien(float[] a) {
		float S = 0;
		int size = a.length;
		for (int i = 0; i < size; i++)
			S += a[i];
		return S;
	}
}