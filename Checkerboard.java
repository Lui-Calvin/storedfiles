import java.awt.Color;
public class Checkerboard {

	public static void main(String[] args) {
		Checkerboard cb = new Checkerboard();
		Color[][] myBoard = new Color[5][7];
		cb.fillCheckerboard( myBoard );

		//check results:
		for ( int i = 0 ; i < 5 ; i++ ) {
			System.out.print("|");
			for ( int j = 0 ; j < 7 ; j++ ) {
				//System.out.print("[");
				if ( myBoard[i][j].equals(Color.WHITE)) {
					System.out.print(" ");
				} else if ( myBoard[i][j].equals(Color.BLACK)) {
					System.out.print("X");
				} else {
					System.out.print("?");
				}
				//System.out.print("]");
			}
			System.out.println("|");
		}

	}

	public void fillCheckerboard(Color[][] board) {

		//YOUR JOB:  IMPLEMENT THIS METHOD!
		for(int k = 0;k<board.length;k++) {
			for(int i =  0; i<board[k].length;i++) {
				if(k % 2 == 1 && i % 2 == 1 || k% 2 == 0 && i%2 == 0) {
					board[k][i] = Color.white;
				} else {
					board[k][i] = Color.black;
				}
			}
		}
	
	}
}
