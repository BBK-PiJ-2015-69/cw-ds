/**
* Interface for Stack implementation extending Abstract Stack
* Stack: LIFO (last in first out) data structure
* Uses List data strucutre for storage
* ReturnObject: We need this to handle errors 
* (such as calls for top of empty stacks)
* because this course has not yet taught exceptions
* @author Luke Jones
*/

public class StackImpl extends AbstractStack {

	// CONSTRUCTOR
	public StackImpl(List list) {
		super(list);
	}

	// GETTER
	public List getList() {
		return internalList;
	}

	// TRUE IF STACK EMPTY
	public boolean isEmpty() {
		if (internalList != null) {
			if (internalList.isEmpty() != false) {
				return true;
			}
		}
		return false;
	}

	// RETURNS NUMBER OF ITEMS IN STACK
	public int size() {
		if (internalList != null) {
			return internalList.size();
		}else{
			return 0;
		}
	}

	// ADDS ELEMENT TO TOP OF STACK
	public void push(Object item){
		if (internalList != null) {
			internalList.add(item);
		}else{
			this.internalList.add(0,item);
		}
	}

	/*
	* TOP
	* RETURNS TOP ITEM IN STACK
	* BUT UNLIKE POP (BELOW) DOESN'T REMOVE IT
	*/ 
	public ReturnObject top() {
		ReturnObjectImpl top = new ReturnObjectImpl();
		if ((internalList != null) && (internalList.size() != 0)) {
			int size = (internalList.size() - 1);
			top.setErrorM(internalList.get(size).getError());
			top.setObject(internalList.get(size).getReturnValue());
		}else{
			top.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
		}
		return top;
	}

	/*
	* POP
	* REMOVES TOP ITEM IN STACK
	* AND RETURNS IT TO US
	*/ 
	public ReturnObject pop() {
		ReturnObjectImpl pop = new ReturnObjectImpl();
		if ((internalList != null) && (internalList.size() != 0)) {
			int size = (internalList.size() - 1);
			pop.setErrorM(internalList.get(size).getError());
			pop.setObject(internalList.get(size).getReturnValue());
		}else{
		 	pop.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
		}
		return pop;
	}

	// TO STRING
	public String toString() {
		String listStr = new String();
		if (getList() != null) {
			for (int i = 0; i < getList().size(); i++){
				listStr += getList().get(i).getReturnValue();
			}
		}
		return listStr;
	}

}