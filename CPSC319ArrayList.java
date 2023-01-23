import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CPSC319ArrayList<T> implements List<T>{
  private T [] data;
  private int arraySize;
  
  public CS319ArrayList(int capacity){
      data = (T[]) new Object[capacity]
      numElements = 0;
  }
  @Override
   public int size() {
      return arraySize;
    
  }
  @Override
  public boolean add(T t){
      
      if(numElements == data.length){
          T[] temp = (T[]) new Object[2* data.length];
          for(int = 0; i < data.length; i++){
                temp[i] = java[i];
          }
          data = temp;    
      }
      
      data[numElements] = t;
      numElements++;
      
      return true;
    
  }
  
  @Override
  public boolean remove (Object o){
      return false;
    
  }
  @Override
  public 
  
  
  public static void main(String[] args){
      CS319ArrayList<Integer> List = new CS319ArrayList<>(capacity:10);
      
      System.out.println("Hello World!");
  }
}
