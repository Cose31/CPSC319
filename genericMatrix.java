import java.util.Scanner;
import java.lang;
import java.lang.reflect.Array;

public class genericMatrix <T> {
	
	private final Class<T> classy;
	
	public genericMatrix(Class<T> classy){
		
		this.classy = classy;
		
	}
	
	public <T> T[][] returnMatrix(int rows, int columns){
		
		@SuppressWarnings("unchecked")
		T[][] matrix = (T[][])Array.newInstance(classy, rows, columns);
		return matrix;
		//constructor of AnyType
	}
	
	public static final void main()
	{
		//genericMatrix.read;
		//genericMatrix.write;
		int input = 5;
		int input2 = 7;
		new genericMatrix<Integer>(Integer.class).returnMatrix(input, input2);
		for ()
			for()
		
	}
	
}