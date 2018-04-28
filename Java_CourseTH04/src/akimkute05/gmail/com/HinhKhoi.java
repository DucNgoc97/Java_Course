package akimkute05.gmail.com;

public class HinhKhoi {
	protected float chieucao;

	public float getChieucao() {
		return chieucao;
	}

	public HinhKhoi(float chieucao) {
		this.chieucao = chieucao;
	}

	@Override
	public String toString() {
		return "chieu cao : " + chieucao;
	}
}
