/**
* Functional Linked List implementation of the List interface
*
* @author Luke Jones
*/

public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	public ReturnObjectImpl head(){
		ReturnObjectImpl obj = new ReturnObjectImpl();
		if(super.isEmpty()){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}
		obj.setObject(super.getValue(0));
		obj.setErrorM(ErrorMessage.NO_ERROR);
		return obj;
	}

	public FunctionalLinkedList rest(){
		FunctionalLinkedList rest = new FunctionalLinkedList();
		rest.setHead(super.getHead().getNext());
		return rest;
	}

}