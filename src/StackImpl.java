/**
* Stack implementation extending Abstract Stack
*
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