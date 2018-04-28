package akimkute05.gmail.com;

public class HinhKhoi1 extends HinhKhoi {

	protected float chieudai;

	public float getChieudai() {
		return chieudai;
	}

	public void setChieudai(float chieudai) {
		this.chieudai = chieudai;
	}

	public HinhKhoi1(float chieucao, float chieudai) {
		super(chieucao);
		this.chieudai = chieudai;
	}

}
