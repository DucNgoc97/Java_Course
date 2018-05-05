package akimkute05.gmail.com;

public class HinhKhoi2 extends HinhKhoi1 {

	protected float chieurong;

	public float getChieurong() {
		return chieurong;
	}

	public void setChieurong(float chieurong) {
		this.chieurong = chieurong;
	}

	public HinhKhoi2(float chieucao, float chieudai, float chieurong) {
		super(chieucao, chieudai);
		this.chieurong = chieurong;
	}
	public double thetich2() {
		return chieucao * chieudai * chieurong;
	}


}
