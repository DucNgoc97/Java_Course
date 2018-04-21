package akimkute05.gmail.com;

public class Round {
	private float R;//Bán kính
	private Point O;//Tâm
	
	public Round() {
		this.R = Math.round(Math.random()*100);
		this.O = new Point();
	}
	
	//Tạo getters và setters cho R và O
	
	//Xét vị trí tương đối điểm với đường tròn: nếu nằm trong - trả về -1; nếu nằm ngoài - trả về 1; nếu nằm trên - trả về 0
	public int ViTriTuongDoiDiemVoiDuongTron(Point A) {
		
		return 0;
	}
}
