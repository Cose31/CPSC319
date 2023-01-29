import java.util.Scanner;
import java.lang.Integer;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Collection;

public class genericMatrix <T extends Number> {
	
	private T [][] data;
	private int matrixRows;
	private int matrixColumns;
	
	public genericMatrix(int rows, int columns){
		
		data = (T[][]) new Object[rows][columns];
		this.matrixRows = rows;
		this.matrixColumns = columns;
		
	}
	
	public void genericRead(int m, int n){ 
		//reads in input from user and places it in generic array one input per index
		//m = rows, n = columns

		Scanner sc = new Scanner(System.in);

		for(int i = 0;i < m; i++){
			System.out.println("Enter the amount of inputs you specified for columns! Please be sure to use spaces between your inputs.");
			String[] line = sc.nextLine().split(" ");
			for(int j = 0; j < n; j++){
				this.data[i][j] = (T) line[j];

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

	public void genericAdd(T[][] matrix1, T[][] matrix2, int rows, int columns){
		//adds two matrices
		
		genericMatrix<Integer> addResult = new genericMatrix<Integer>(rows, columns);
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				addResult.data[i][j] = matrix1.data[i][j] + matrix2.data[i][j];
				
			}
		}
			System.out.println("The result of the add operation on the two matrices is as follows: " + "\n");

			addResult.genericWrite(rows, columns);
		}

	public void genericSum(){
		//sums all elements in the current matrix that is called

		int rows = this.matrixRows;
		int columns = this.matrixColumns;

		anyType summation;

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				summation += this.data[i][j];

			}
		}
		System.out.println("This is the summation of the matrix." + "\n");
		System.out.print(summation);

	}

}