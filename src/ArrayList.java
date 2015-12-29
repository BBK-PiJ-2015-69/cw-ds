/**
* An Array implementation of the List interface
*
* @author Luke Jones
*/

public class ArrayList implements List {

	private Object[] list;
	private int numberOfElements;
	private final static int DEFAULT_ARRAY_SIZE = 5;
	private final static int MAX_ARRAY_SIZE = 10000;

	// CONSTRUCTOR
	public ArrayList(){
		numberOfElements = 0;
		list = new Object[DEFAULT_ARRAY_SIZE];
	}

	// GETTERS
	public Object[] getObj(){
		return obj;
	}

	public Object getElement(int i) {
		if(numberOfElements != 0) {
			return obj[i];
		}else{
			return null;
		}
	}

	/** // MAIN
	public static void main(String[] args){

	} **/

	// IF EMPTY, RETURN TRUE, ELSE FALSE
	public boolean isEmpty() {
		return (numberOfElements == 0);
	} 

	// RETURN CURRENT NUMBER OF ITEMS
	public int size() {
		return numberOfElements;
	}

	/* 
	* RETURNS NUMBER OF ITEMS AT CURRENT POSITION
	* PARAMETER IS POSITION IN LIST OF ITEM TO RETRIEVE
	*/
	public ReturnObject get(int index){
		ReturnObjectImpl obj = checkIndex(index);
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		if (obj.getError() == ErrorMessage.No_ERROR) {
			obj.setObj(list[index]);
			if(list[index] == null){
				obj.setErrorM(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			}
		}
		return obj;
	}

	// ADD

	/*
	* ADDS AN ELEMENT TO LIST
	* FIRST PARAMETER IS INDEX OF POSITION ATT WHICH TO INSERT
	* MUST ALSO UPDATE INDICES BEFORE AND AFTER THIS POSITION
	* SECOND PARAMETER IS VALUE TO INSERT INTO LIST
	* 
	*/
	public ReturnObject add(int index, Object item){
		ReturnObjectImpl obj = checkIndex(index);
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* OR IF NULL OBJECT PROVIDED (MUST REJECT)
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/		
		
	}

	/*
	* ADDS AN ELEMENT TO LIST
	* PARAMETER IS INDEX OF POSITION ATT WHICH TO INSERT
	* MUST ALSO UPDATE INDICES BEFORE AND AFTER THIS POSITION
	* 
	*/
	public ReturnObject add(int index){
		ReturnObjectImpl obj = checkIndex(index);
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/

	}

	/* 
	* DELETES AN ELEMENT FROM THE LIST 
	*
	*/
	public ReturnObject remove(int index){
		ReturnObjectImpl obj = checkIndex(index);
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		
	}

}