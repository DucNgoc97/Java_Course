package akimkute05.gmail.com;

public class HinhKhoi3 extends HinhKhoi {

	private float bankinh;

	public float getBankinh() {
		return bankinh;
	}

	public void setBankinh(float bankinh) {
		this.bankinh = bankinh;
	}

	public HinhKhoi3(float chieucao, float bankinh) {
		super(chieucao);
		this.bankinh = bankinh;
	}

	public double thetich3() {
		return chieucao * Math.PI * Math.pow(bankinh, 2);
	}

}