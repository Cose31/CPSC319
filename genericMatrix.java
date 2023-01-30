import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

public class genericMatrix <T extends Number> {
	
	private T[][] data;
	private int matrixRows;
	private int matrixColumns;
	
	public genericMatrix (int rows, int columns){
		
		data = (T[][]) new Object[rows][columns];
		this.matrixRows = rows;
		this.matrixColumns = columns;
		
	}
	
	public void genericRead(int m, int n){ 
		//reads in input from user and places it in generic array one input per index
		//m = rows, n = columns

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < m; i++){
			System.out.println("Enter the amount of inputs you specified for columns! Please be sure to use spaces between your inputs.");
			String[] line = sc.nextLine().split(" ");
			for(int j = 0; j < n; j++){
				Double intermediate = new Double (line[j]);
				Double doubleVal = intermediate.doubleValue();
				this.data[i][j] = (T) doubleVal;
			}
	
		}
		sc.close();
	}

	public void genericWrite(int m, int n){
		//writes back out user input in a 2d matrix form
		//m = rows, n = columns

		for(int i = 0;i < m; i++){
			System.out.println();
			for(int j = 0; j < n; j++){
				System.out.print(this.data[i][j]);
				System.out.print("\t");

			}

		}

	}

	public void genericAdd(genericMatrix <T> matrix1, genericMatrix <T> matrix2, int rows, int columns){
		//adds two matrices
		
		genericMatrix<T> addResult = new genericMatrix<T>(rows, columns);
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){

				
				Double theResult = (matrix1.data[i][j]).doubleValue() + (matrix2.data[i][j]).doubleValue();
				addResult.data[i][j] = (T) theResult;
			}
		}
			System.out.println("The result of the add operation on the two matrices is as follows: " + "\n");

			addResult.genericWrite(rows, columns);
		}

	public void genericSum(){
		//sums all elements in the current matrix that is called

		int rows = this.matrixRows;
		int columns = this.matrixColumns;

		double summation = 0.0;

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				
				summation += (this.data[i][j]).doubleValue();

			}
		}
		System.out.println("This is the summation of the matrix." + "\n");
		System.out.print(summation);

	}
	
	public static void main(String[] args)
	{
		//genericMatrix.read;
		//genericMatrix.write;
		int input = 2, input2 = 3, input3 = 4, input4 = 5;  	//test for add matrix with different rows/columns
		

		Scanner scaninput = new Scanner(System.in);

		System.out.println("Please enter what the dimensions of your matrix are (n rows, and m columns). Enter n then m: ");
		String[] ln = scaninput.nextLine().split(",");

		Integer a = new Integer(ln[0]);
		Integer b = new Integer(ln[1]);
		input = a.intValue();
		input2 = b.intValue();

		//type
		
		
		genericMatrix<Integer> usermat1 = new genericMatrix<>(input, input2);

		usermat1.genericRead(input, input2); 			//tests for genericRead
		//usermat2.genericRead(input, input2);			//==
		//usermat1.genericWrite();		//tests for genericWrite
		//usermat2.genericWrite();		//==


		//addSectiontest
		//write comparison statement for matrixes rows and columns, if they do not match, then throw exception
		
		//genericAdd(usermat1, usermat2);

		//sumSectionTest

	}
}