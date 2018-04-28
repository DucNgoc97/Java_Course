package akimkute05.gmail.com;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		int numP = 5;//Số lượng điểm
		int numR = 3;//Số lượng đường tròn
		ArrayList<Point> points = new ArrayList<Point>();//Danh sách điểm
		ArrayList<Round> rounds = new ArrayList<Round>();//Danh sách đường tròn
		
		//Tạo một danh sách điểm
		for(int i=0; i<numP; i++)
			points.add(new Point());
		//Tạo một danh sách đường tròn
		for(int i=0; i<numR; i++)
			rounds.add(new Round());
		//Gọi phương thức xét vị trí tương đối
		
	}

}
