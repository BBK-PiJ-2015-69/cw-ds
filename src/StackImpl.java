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

	public StackImpl(List list) {
		super(list);
	}

	public List getList() {
		return internalList;
	}

	public boolean isEmpty() {
		if (internalList != null) {
			if (internalList.isEmpty() != false) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		if (internalList != null) {
			internalList.add(item);
		}
	}

	public void push(Object item){
		if (internalList != null) {
			List placeholder = new ArrayList();
			placeholder.add(item);
			this.internalList = placeholder();
		}else{
			this.internalList.add(0,item);
		}
	}

	public ReturnObject top() {
		ReturnObjectImpl obj = new ReturnObjectImpl();
		if(super.isEmpty()){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}
		obj.setObject(super.getValue(0));
		obj.setErrorM(ErrorMessage.NO_ERROR);
		return obj;
	}

	public ReturnObject pop() {
		ReturnObjectImpl obj = new ReturnObjectImpl();
		if(super.isEmpty()){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}
		obj.setObject(super.getValue(0));
		obj.setErrorM(ErrorMessage.NO_ERROR);
		return obj;
	}

	public String toString() {
		String listStr = new String();
		if (getList() != null) {
			for (int i = 0; i < getList().size; i++){
				listStr += getList().get(i).getReturnValue();
			}
		}
		return listStr;
	}

}