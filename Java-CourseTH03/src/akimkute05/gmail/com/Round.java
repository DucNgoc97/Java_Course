package akimkute05.gmail.com;

public class Round {
	private float R;// Bán kính
	private Point O;// Tâm
 
	public Round() {
		this.setR(Math.round(Math.random() * 100));
		this.setO(new Point());
	}

	private float getR() {
		return R;
	}

	private void setR(float r) {
		R = r;
	}

	private Point getO() {
		return O;
	}

	private void setO(Point o) {
		O = o;
	}

	// Xét vị trí tương đối điểm với đường tròn: nếu nằm trong - trả về -1; nếu nằm
	// ngoài - trả về 1; nếu nằm trên - trả về 0
	public int ViTriTuongDoiDiemVoiDuongTron(Point A) {
		// khoảng cách giữa 2 điểm :
		// this.x this.y <--> M{x,y}
		// sqrt((this.x - M.x)^2 + (this.y - M.y)^2)
		float result = (float) Math.sqrt(Math.pow(A.getX() - O.getX(), 2) + Math.pow(A.getY() - O.getY(), 2));
		if (result == R) {
			return 0;
		} else if (result < R) {
			return -1;
		} else if (result > R) {
			return 1;
		}
		return 0;
	}

}
