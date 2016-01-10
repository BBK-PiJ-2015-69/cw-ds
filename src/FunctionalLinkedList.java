/**
* Functional Linked List implementation of the List interface
*
* @author Luke Jones
*/

public class FunctionalLinkedList extends LinkedList implements FunctionalList {

	public ReturnObjectImpl head(){
		ReturnObjectImpl obj = new ReturnObjectImpl();
		obj = get(0);
		if(obj.getReturnValue() == null){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
		}
		return obj;
	}

	public FunctionalLinkedList rest(){
		FunctionalLinkedList rest = new FunctionalLinkedList();
		rest.setHead(super.getHead().getNext());
		return rest;
	}

}