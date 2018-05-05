package akimkute05.gmail.com;

import java.util.ArrayList;

public class MainClass {
 
	public static void main(String[] args) {
		int numP = 5;// Số lượng điểm
		int numR = 3;// Số lượng đường tròn
		ArrayList<Point> points = new ArrayList<Point>();// Danh sách điểm
		ArrayList<Round> rounds = new ArrayList<Round>();// Danh sách đường tròn

		for (int j = 0; j <= numR; j++) {
			rounds.add(new Round());
			for (int i = 0; i <= numP; i++) {
				points.add(new Point());
				int result = rounds.get(j).ViTriTuongDoiDiemVoiDuongTron(points.get(i));
				if (result == 1) {
					System.out.println("Điểm " + (i+1) + " nằm trong đường tròn " + (j+1));
				} 
				else if (result == 0) {
					System.out.println("Điểm " + (i+1) + " nằm trên đường tròn " + (j+1));
				} 
				else if (result == -1) {
					System.out.println("Điểm " + (i+1) + " nằm ngoài đường tròn " + (j+1));
				}	
			}
			System.out.println("================^_^>=>=================");
		}

	}

}
