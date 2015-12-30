/**
* LinkedList implementation of List
* List: Common way to store arrays of data; collection of any kind of objects.
* No null objects. As many as JVM memory can take.
* Types may be String, Integers, Doubles and other Lists themselves.
* First element has index of zero; not one.
* ReturnObject: We need this to handle errors such as null objects
* because this course has not yet taught exceptions
* @author Luke Jones
*/
public class LinkedList implements List {

	private Node head;
	private Node tail;
	private int numberOfElements; //needed?
	private int lastPosition = -1; //needed?

	// CONSTRUCTOR
	public LinkedList() {
		this.head = null;
	}

	// GETTERS
	public Node getHead() {
		return head;
	}

	public void getTail() {
		return tail;
	}

	public int getLastPosition() {
		return lastPosition;
	}

	// SETTERS
	public void setHead(Node head) {
		this.head = head;
	}

	public void setTail(Node head) {
		this.tail = tail;
	}

	public void setLastPosition(int lastPosition) {
		this.lastPosition = lastPosition;
	}

	// TRUE IF LIST EMPTY
	public boolean isEmpty() {
		if (this.lastPosition == -1) {
			return true;
		}
		return false;
	}

	// RETURNS NUMBER OF ITEMS IN LIST
	public int size(){
		return numberOfElements; //return(this.lastPosition + 1);
	}

	// TO STRING
	public String toString(){
		if(this.head != null) {
			return this.head.toString();
		}else{
			return "";
		}
	}

	// TO STRING ALL
	public String toStringAll(){
		ObjectNode current = new ObjectNode();
		current = this.head;
		String list = "";
		if (current == null) {
			return list;
		}
		while (current != null) {
			list += current.toString();
			current = current.getNext();
		}
		return list;
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
	public ReturnObject get(int index) {
		ReturnObjectImpl obj = new ReturnObjectImpl();
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		if(super.isEmpty()){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}
		obj.setObject(super.getValue(0));
		obj.setErrorM(ErrorMessage.NO_ERROR);
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
	public ReturnObject add(int index, Object item) {
		ReturnObjectImpl obj = new ReturnObjectImpl();
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* OR IF NULL OBJECT PROVIDED (MUST REJECT)
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/	
		if(super.isEmpty()){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}
		obj.setObject(super.getValue(0));
		obj.setErrorM(ErrorMessage.NO_ERROR);
		return obj;
	}

	/*
	* ADDS AN ELEMENT TO LIST
	* PARAMETER IS VALUE TO INSERT INTO LIST
	* 
	*/
	public ReturnObject add(Object item) {
		ReturnObjectImpl obj = new ReturnObjectImpl();
		/* 
		* IF NULL OBJECT PROVIDED (MUST REJECT)
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		if(super.isEmpty()){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}
		obj.setObject(super.getValue(0));
		obj.setErrorM(ErrorMessage.NO_ERROR);
		return obj;
	}

	/* 
	* DELETES AN ELEMENT FROM THE LIST 
	* PARAMETER IS POSITION OF ITEM TO REMOVE
	* MUST ALSO UPDATE INDICES BEFORE AND AFTER THIS POSITION
	*/
	public ReturnObject remove(int index) {
		ReturnObjectImpl obj = new ReturnObjectImpl();
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		if(super.isEmpty()){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}
		obj.setObject(super.getValue(0));
		obj.setErrorM(ErrorMessage.NO_ERROR);
		return obj;
	}
}