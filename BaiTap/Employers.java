package akimkute05.gmail.com;

import java.util.ArrayList;

public class Employers implements ISearch {
	private ArrayList<Employer> em = new ArrayList<>();

	public ArrayList<Employer> getEm() {
		return em;
	}

	public void setEm(ArrayList<Employer> em) {
		this.em = em;
	}

	@Override
	public Object TimKiem(int from, int to) {
		return null;
	}

	@Override
	public Object TimKiem(boolean gt) {
		return null;
	}

	@Override
	public Object TimKiem(String ten) {
		return null;
	}

	public Object TimKiem(double from, double to) {
		ArrayList<Employer> kq = new ArrayList<>();
		for (int i = 0; i < em.size(); i++) {
			if (em.get(i).TinhLuong() >= from && em.get(i).TinhLuong() <= to) {
				kq.add(em.get(i));
			}
		}
		return kq;
	}
}