package P20220413.diemension;

public class Class10ArrayEx {
	public static void main(String[] args) {
	//	int[][] intary = new int[3][4];

		// intary[0][0] = 10;
		// intary[1][0] = 20;
		// intary[3][2] = 100;

	//	for (int j = 0; j < intary.length; j++) {

	//		for (int i = 0; i < intary[j].length; i++) {
				// System.out.print("[" + j + "]" + "[" + i + "] =>" + intary[j][i] + " ");
	//		}
	//		System.out.println();
//		}

		int[][] intar = new int[5][5];		
		int num = 0;
			
			//배열에서는 인덱스 주소값으로 값을 지정, 호출
		for (int j = 0; j < intar.length; j++) {
			
			for (int i = 0; i < intar[j].length; i++) {
				num++;
				intar[i][j] += num;
				System.out.printf("%3d", intar[i][j]);
			}
			System.out.println();
		}
	}

}
