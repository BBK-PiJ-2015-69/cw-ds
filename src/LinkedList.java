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
		String ary[];
		for (int i = 0; i < numberOfElements; i++) {
			if(list[i] != null) {
				ary += list[i];
			}
		}
		return ary;
	}

	// RETURNS OBJECT AT POSITION OF INDEX
	public ReturnObject get(int index) {
		ReturnObjectImpl obj = new ReturnObjectImpl();
		if(super.isEmpty()){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}
		obj.setObject(super.getValue(0));
		obj.setErrorM(ErrorMessage.NO_ERROR);
		return obj;
	}

	public ReturnObject add(int index, Object item) {
		ReturnObjectImpl obj = new ReturnObjectImpl();
		if(super.isEmpty()){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}
		obj.setObject(super.getValue(0));
		obj.setErrorM(ErrorMessage.NO_ERROR);
		return obj;
	}

	public ReturnObject add(Object item) {
		ReturnObjectImpl obj = new ReturnObjectImpl();
		if(super.isEmpty()){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}
		obj.setObject(super.getValue(0));
		obj.setErrorM(ErrorMessage.NO_ERROR);
		return obj;
	}

	public ReturnObject remove(int index) {
		ReturnObjectImpl obj = new ReturnObjectImpl();
		if(super.isEmpty()){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}
		obj.setObject(super.getValue(0));
		obj.setErrorM(ErrorMessage.NO_ERROR);
		return obj;
	}
}