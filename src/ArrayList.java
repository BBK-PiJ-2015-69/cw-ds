/**
* An Array implementation of the List interface
* List: Common way to store arrays of data; collection of any kind of aryObjects.
* No null aryObjects. As many as JVM memory can take.
* Types may be String, Integers, Doubles and other Lists themselves.
* First element has index of zero; not one.
* Array: A container aryObject holds fixed number of values; single type
* An approved data structure for this coursework assignment
* ReturnObject: We need this to handle errors such as null aryObjects
* because this course has not yet taught exceptions
* @author Luke Jones
*/

public class ArrayList implements List {

	private Object[] aryObj;
	private int numberOfElements;
	private final static int DEFAULT_ARRAY_SIZE = 5;
	private final static int MAX_ARRAY_SIZE = 10000;

	// CONSTRUCTOR
	public ArrayList(){
		numberOfElements = 0;
		aryObj = new Object[DEFAULT_ARRAY_SIZE];
	}

	// GETTERS
	public Object[] getObject(){
		return aryObj;
	}

	public Object getElement(int i) {
		if(numberOfElements != 0) {
			return aryObj[i];
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

	// TO STRING
	public String toString(){
		String ary = "";
		for (int i = 0; i < numberOfElements; i++) {
			if(aryObj[i] != null) {
				ary += aryObj[i];
			}
		}
		return ary;
	}

	// INCREASE ARRAY SIZE
	public void increaseArray(){
		if(aryObj.length != 6000){
			Object[] placeholder = new Object[aryObj.length * 2];
			for (int i = 0; i < numberOfElements; i++) {
				placeholder[i] = this.aryObj[i];
			}
			this.aryObj = placeholder;
		}
	}

	/*
	* CHECKS AN INDEX AGAAINST ELEMENTS IN LIST
	* PARAMETER IS THE INDEX IN QUESTION
	* 
	*/
	public ReturnObjectImpl checkIndex(int index){
		ReturnObjectImpl obj = new ReturnObjectImpl();
		if (aryObj.length - 2 <= index) {
			increaseArray();
			obj = checkIndex(index);
		}else if (numberOfElements == 0) {
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
		}else if (index > numberOfElements || index < 0) {
			obj.setErrorM(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else{
			obj.setObject(aryObj[index]);
			obj.setErrorM(ErrorMessage.NO_ERROR);
		}
		return obj;
	}

	/* 
	* RETURNS NUMBER OF ITEMS AT CURRENT POSITION
	* PARAMETER IS POSITION IN LIST OF ITEM TO RETRIEVE
	*/
	public ReturnObjectImpl get(int index){
		ReturnObjectImpl getterObj = checkIndex(index);
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		if (getterObj.getError() == ErrorMessage.NO_ERROR) {
			getterObj.setObject(aryObj[index]);
			if(aryObj[index] == null){
				getterObj.setErrorM(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			}
		}
		return getterObj;
	}

	// ADD

	/*
	* ADDS AN ELEMENT TO LIST
	* FIRST PARAMETER IS INDEX OF POSITION AT WHICH TO INSERT
	* MUST ALSO UPDATE INDICES BEFORE AND AFTER THIS POSITION
	* SECOND PARAMETER IS VALUE TO INSERT INTO LIST
	* 
	*/
	public ReturnObjectImpl add(int index, Object item){
		ReturnObjectImpl addIndexItemObj = checkIndex(index);
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* OR IF NULL OBJECT PROVIDED (MUST REJECT)
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/		
		if(addIndexItemObj.getError() == ErrorMessage.EMPTY_STRUCTURE) {
			aryObj[index] = item;
			addIndexItemObj.setErrorM(ErrorMessage.NO_ERROR);
			numberOfElements++;
		}else if(addIndexItemObj.getError() == ErrorMessage.NO_ERROR){
			if(item != null) {
				addIndexItemObj.setObject(item);
				if(aryObj[index] == null) {
					numberOfElements++;
				}
				aryObj[index] = item;
			}else{
				addIndexItemObj.setErrorM(ErrorMessage.INVALID_ARGUMENT);
			}
		}
		return addIndexItemObj;
	}

	/*
	* ADDS AN ELEMENT TO LIST
	* PARAMETER IS VALUE TO INSERT INTO LIST
	* 
	*/
	public ReturnObjectImpl add(Object item){
		ReturnObjectImpl addOnlyItemObj = new ReturnObjectImpl(item);
		/* 
		* IF NULL OBJECT PROVIDED (MUST REJECT)
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		if (item == null) {
			addOnlyItemObj.setErrorM(ErrorMessage.INVALID_ARGUMENT);
			return addOnlyItemObj;
		}
		if((numberOfElements + 1) >= aryObj.length) {
			increaseArray();
		}
		if(aryObj[numberOfElements] != null) {
			for(int i = numberOfElements; i < aryObj.length; i++) {
				if(aryObj[i] == null) {
					aryObj[i] = item;
					numberOfElements++;
					addOnlyItemObj.setErrorM(ErrorMessage.NO_ERROR);
					return addOnlyItemObj;
				}
			}
		}else{
			aryObj[numberOfElements] = item;
			numberOfElements++;
			addOnlyItemObj.setErrorM(ErrorMessage.NO_ERROR);
			return addOnlyItemObj;
		}
		return addOnlyItemObj;
	}

	/* 
	* DELETES AN ELEMENT FROM THE LIST 
	* PARAMETER IS POSITION OF ITEM TO REMOVE
	* MUST ALSO UPDATE INDICES BEFORE AND AFTER THIS POSITION
	*/
	public ReturnObjectImpl remove(int index){
		ReturnObjectImpl removeObj = checkIndex(index);
		Object placeholder = new Object();
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		if(removeObj.getError() == ErrorMessage.NO_ERROR) {
			removeObj.setObject(aryObj[index]);
			for(int i = index; i < aryObj.length; i++) {
				if ((i + 1) != aryObj.length) {
					placeholder = aryObj[i++];
				}else{
					placeholder = null;
				}
				aryObj[i] = placeholder;
			}
			numberOfElements--;
		}
		return removeObj;
	}

}