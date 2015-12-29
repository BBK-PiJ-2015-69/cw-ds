/**
* An Array implementation of the List interface
*
* @author Luke Jones
*/

public class ArrayList implements List {

	private Object[] list;
	private int ArrayCount;
	private final static int DEFAULT_ARRAY_SIZE = 30;

	public ArrayList(){
		numberOfElements = 0;
		list = new Object[DEFAULT_ARRAY_SIZE];
	}

	public static void main(String[] args){

	}

	public boolean isEmpty() {
		return (numberOfElements == 0);
	} 

	public int size() {
		return numberOfElements;
	}

	public ReturnObject get(int index){

	}

	public ReturnObject add(int index, Object item){
		
	}

	public ReturnObject add(int index){
		
	}

	public ReturnObject remove(int index){
		
	}

}