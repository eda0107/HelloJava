package hello;

public class Bingo {
	public static void main(String[] args) {
	
		
		
		int[][] intAry = new int[5][5];
		int a = 1;
		
		for (int i=0; i<intAry.length; i++) {
			for (int j=0; j<intAry[i].length; j++) {
				intAry[i][j] = a++;	
			}
		}
		for (int j = intAry.length-1; j >= 0; j--) {
			for(int i = 0; i <= intAry[j].length; i++) {
				System.out.println(intAry[i][j] + "	");
			}
			System.out.println();	
		}
	
	}
}
