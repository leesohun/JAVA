package multi;

public class MultiArray02 {

	public static void main(String[] args) {
		int [][] ar = new int[10][10];
		int num = 0;
		
		//입력
	
		
		
		/*for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				num++;
				ar[i][j] = num;
				
			}//for j
		}//for i*/
		
		
		
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				num++;
//				ar[j][i] = num;
//				
//			}//for j
//		}//for i
		
		for(int i=ar.length-1; i>=0; i--) {
			for(int j=ar[i].length-1; j>=0; j--) {
				num++; //1 2 3 4 5
				ar[i][j] = num;
				
			}//for j
		}//for i
		
		
		
		
//		ar[9][9]=1;   ar[8][9]=11;
//		ar[9][8]=2;   ar[8][8]=12;
//		ar[9][7]=3;   ar[8][7]=13;
		
//출력하는 부분은 바꾸지 못한다		
		
		
		
		
		
		
		//출력
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}//for j
			System.out.println();
		}//for i

	}

}
