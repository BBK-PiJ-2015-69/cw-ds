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
	* CHECKS AN INDEX AGAAINST ELEMENTS IN LIST
	* PARAMETER IS THE INDEX IN QUESTION
	* 
	*/
	public ReturnObject check(int index){
		ReturnObjectImpl obj = new ReturnObjectImpl();
		if ( (list.length - 2) <= index) {
			obj = checkIndex(index);
			increaseArray;
		}else if (numberOfElements == 0) {
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
		}else if (index > numberOfElements || index < 0) {
			obj.setErrorM(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else{
			obj.setErrorM(ErrorMessage.NO_ERROR);
			obj.setObj(list[index]);
		}
		return obj;
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
		if (obj.getError() == ErrorMessage.NO_ERROR) {
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
	* FIRST PARAMETER IS INDEX OF POSITION AT WHICH TO INSERT
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
		if(obj.getError() == ErrorMessage.EMPTY_STRUCTURE) {
			numberOfElements++;
			list[index] = item;
			index.setErrorM(ErrorMessage.NO_ERROR);
		}else if(obj.getError() == ErrorMessage.NO_ERROR){
			if(item != null) {
				obj.setObj(item);
				if(list[index] == null) {
					numberOfElements++;
				}
				list[index] = item;
			}else{
				obj.setErrorM(ErrorMessage.INVALID_ARGUMENT);
			}
		}
		return obj;
	}

	/*
	* ADDS AN ELEMENT TO LIST
	* PARAMETER IS VALUE TO INSERT INTO LIST
	* 
	*/
	public ReturnObject add(Object item){
		ReturnObjectImpl obj = new ReturnObjectImpl(item);
		/* 
		* IF NULL OBJECT PROVIDED (MUST REJECT)
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		if (item == null) {
			obj.setErrorM(ErrorMessage.INVALID_ARGUMENT);
			return obj;
		}
		if((numberOfElements + 1) >= list.length) {
			increaseArray();
		}
		if(list[numberOfElements] != null) {
			for(int i = size; i < list.length; i++) {
				if(list[i] == null) {
					list[i] = item;
					numberOfElements++;
					obj.setErrorM(ErrorMessage.NO_ERROR);
					return obj;
				}
			}
		}else{
			list[numberOfElements] = item;
			numberOfElements++;
			list.setErrorM(ErrorMessage.NO_ERROR);
			return obj;
		}
		return obj;
	}

	/* 
	* DELETES AN ELEMENT FROM THE LIST 
	* PARAMETER IS POSITION OF ITEM TO REMOVE
	* MUST ALSO UPDATE INDICES BEFORE AND AFTER THIS POSITION
	*/
	public ReturnObject remove(int index){
		ReturnObjectImpl obj = checkIndex(index);
		Object placeholder = new Object();
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		if(obj.getError() == ErrorMessage.NO_ERROR) {
			obj.setObj(list[index]);
			for(int i = index; i < list.length; i++) {
				if ((i + 1) != list.length) {
					placeholder = list[i++];
				}else{
					placeholder = null;
				}
				list[i] = temp;
			}
			numberOfElements--;
		}
		return obj;
	}

}