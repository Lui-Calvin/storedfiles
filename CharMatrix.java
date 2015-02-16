// Implements a 2-D array of characters

public class CharMatrix
{
  // Fields:
	private static char[][] Matrix;
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    Matrix = new char[rows][cols];
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
    Matrix = new char[rows][cols];
    for(int r = 0; r<rows;r++) {
    	for(int c = 0; c < cols;c++) {
    		Matrix[r][c] = fill;
    	}
    }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
  return Matrix.length;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
    return Matrix[0].length;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
    return Matrix[row][col];
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
	  Matrix[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
    boolean t = false;
    if(Matrix[row][col] == ' ') {
    	t = true;
    }
    return t;
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for(int i = row0; i <= row1; i++) {
    	for(int k = col0; k<=col1;k++) {
    		Matrix[i][k] = fill;
    	}
    }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
	  for(int i = row0; i <= row1; i++) {
	    	for(int k = col0; k<=col1;k++) {
	    		Matrix[i][k] = ' ';
	    	}
	    }
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
	  int count = 0;
	  for(int i = 0;i<Matrix[row].length;i++) {
		  if(Matrix[row][i] != ' ') {
			  count++;
		  }
	  }
    return count;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
	  int count = 0;
	  for(int i = 0;i<Matrix.length;i++) {
		  if(Matrix[i][col] != ' ') {
			  count++;
		  }
	  }
	  return count;
  }
  
  public static void main(String[] args) {
	  CharMatrix C = new CharMatrix(5,5,'a');
	  C.setCharAt(1,1,' ');
	  System.out.println(C.countInCol(1));
	  System.out.println(C.isEmpty(1, 1));
	  System.out.println(C.charAt(1,1));
	  C.fillRect(1,1,3,3,'b');
	  for(int r = 0; r<Matrix.length;r++) {
	    	for(int c = 0; c < Matrix[0].length;c++) {
	    		System.out.print(Matrix[r][c]);;
	    	}
	    	System.out.println();
	    }
  }
}
