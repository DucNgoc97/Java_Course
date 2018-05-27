package akimkute05.gmail.com;

import java.util.ArrayList;

public class Students implements ISearch {

	private ArrayList<Student> st = new ArrayList<>();

	public ArrayList<Student> getSt() {
		return st;
	}

	public void setSt(ArrayList<Student> st) {
		this.st = st;
	}

	@Override
	public Object TimKiem(int from, int to) {
		ArrayList<Student> kq = new ArrayList<>();
		for (int i = 0; i < st.size(); i++) {
			if (st.get(i).tinhTuoi() >= from && st.get(i).tinhTuoi() <= to) {
				kq.add(st.get(i));
			}
		}
		return kq;
	}

	@Override
	public Object TimKiem(boolean gt) {
		ArrayList<Student> kq = new ArrayList<>();
		for (int i = 0; i < st.size(); i++) {
			if (st.get(i).getGioitinh() == gt) {
				kq.add(st.get(i));
			}
		}
		return kq;
	}

	@Override
	public Object TimKiem(String ten) {
		ArrayList<Student> kq = new ArrayList<>();
		for (int i = 0; i < st.size(); i++) {
			if (st.get(i).getHoten().indexOf(ten) >= 0) {
				kq.add(st.get(i));
			}
		}
		return kq;
	}
}