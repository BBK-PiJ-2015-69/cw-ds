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

	public Node getTail() {
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
		Node current = new Node();
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

	// IF INDEX VALID
	private boolean validIndex (int index, String oper) {
		int maxIndex = this.size();
		if(oper.equals("add")) {
			maxIndex++;
		}
		if((index < 0) || (index >= maxIndex)) {
			return false;
		}
		else{
			return true;
		}
	}

	/*
	* CHECKS AN INDEX AGAAINST ELEMENTS IN LIST
	* PARAMETER IS THE INDEX IN QUESTION
	* 
	*/
	public ReturnObjectImpl checkIndex(int index){
		ReturnObjectImpl obj = new ReturnObjectImpl();
		Node current = new Node();
		current = this.head;
		if (index < 0) {
			obj.setErrorM(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}else if (this.head == null) {
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
		}
		for (int i = 0; i < index; i++) {
			if (current.getNext() == null) {
				obj.setErrorM(ErrorMessage.INDEX_OUT_OF_BOUNDS);
				return obj;
			}
			current = current.getNext();
		}
		obj.setObject(current.getObject());
		obj.setErrorM(ErrorMessage.NO_ERROR);
		return obj;
	}

	/* 
	* RETURNS NUMBER OF ITEMS AT CURRENT POSITION
	* PARAMETER IS POSITION IN LIST OF ITEM TO RETRIEVE
	*/
	public ReturnObjectImpl get(int index) {
		ReturnObjectImpl obj = checkIndex(index);
		Node current = new Node();
		current = this.head;
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		if(obj.getError() == ErrorMessage.NO_ERROR) {
			for (int i = 0; i < index; i++) {
				current = current.getNext();
			}
			obj.setObject(current.getObject());
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
	public ReturnObjectImpl add(int index, Object item) {
		ReturnObjectImpl obj = checkIndex(index);
		Node current = new Node();
		current = this.head;
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* OR IF NULL OBJECT PROVIDED (MUST REJECT)
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/	
		if(!this.validIndex(index,"add")) {
 			obj.setErrorM(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if(obj.getError() == ErrorMessage.EMPTY_STRUCTURE && index == 0) {
			numberOfElements++;
			Node newNode = new Node(null, item);
			this.head = newNode;
			obj.setErrorM(ErrorMessage.NO_ERROR);
			obj.setObject(newNode.getObject());
		}else{
			numberOfElements++;
			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}
			Node newItem = new Node(current, item);
			current.setNext(newItem);
			obj.setObject(newItem.getObject());
			if (current.getNext().getNext() != null) {
				current.getNext().getNext().setPrevious(newItem);
			}
		}
		return obj;
	}

	/*
	* ADDS AN ELEMENT TO LIST
	* PARAMETER IS VALUE TO INSERT INTO LIST
	* 
	*/
	public ReturnObjectImpl add(Object item) {
		ReturnObjectImpl obj = new ReturnObjectImpl();
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* OR IF NULL OBJECT PROVIDED (MUST REJECT)
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/	
		if(item == null) {
			obj.setErrorM(ErrorMessage.INVALID_ARGUMENT);
		}else{
			if(this.head == null){ 
				numberOfElements++;
				Node newNode = new Node(null, item);
				this.head = newNode;
				obj.setErrorM(ErrorMessage.NO_ERROR);
				obj.setObject(newNode.getObject());
			}else{
				Node current = new Node();
				current = this.head;
				while (current.getNext() != null) {
					current = current.getNext();
				}
				numberOfElements++;
				Node newItem = new Node(current, item);
				current.setNext(newItem);
				obj.setObject(newItem.getObject());
				obj.setErrorM(ErrorMessage.NO_ERROR);
			}
		}
		return obj;
	}

	/* 
	* DELETES AN ELEMENT FROM THE LIST 
	* PARAMETER IS POSITION OF ITEM TO REMOVE
	* MUST ALSO UPDATE INDICES BEFORE AND AFTER THIS POSITION
	*/
	public ReturnObjectImpl remove(int index) {
		ReturnObjectImpl obj = checkIndex(index);
		Node current = new Node();
		current = this.head;
		/* 
		* IF INDEX IS EQUAL TO OR GREATER THAN SIZE OF LIST, OR NEGATIVE
		* ERROR IS RETURNED	(IN RETURNOBJECT)
		*/
		if(obj.getError() == ErrorMessage.NO_ERROR){
			if(index == 0) {
				obj.setObject(head.getObject());
				if(head.getNext() == null) {
					this.head = null;
					obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
				}else{
					this.head.getNext().setPrevious(null);
					this.head = head.getNext();
				}
				numberOfElements--;
			}else {
				for (int i = 0; i < (index - 1); i++) {
					current = current.getNext();
				}
				if (current.getNext().getNext() == null){
					current.setNext(null);
				}else{
					current.getNext().getNext().setPrevious(current);
					current.setNext(current.getNext().getNext());
				}
				numberOfElements--;
				obj.setObject(current.getObject());
			}

		}
		return obj;
	}
}