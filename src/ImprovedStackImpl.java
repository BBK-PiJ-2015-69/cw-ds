/**
* Implementation of the Improved Stack
* Incrased number of methods
* The base data structure for storage will be List 
* ReturnObject: We need this to handle errors such as calls to null list
* because this course has not yet taught exceptions
* @author Luke Jones
*/

public class ImprovedStackImpl implements ImprovedStack {

	private List list;

	public ImprovedStackImpl(){
		this.list = null;
	}

	public ImprovedStackImpl(List list){
		this.list = list;
	}

	public List getList(){
		return this.list;
	}	

	public int size(){
		return list.size();
	}

	public boolean isEmpty(){
		return list.isEmpty();
	}

	public void push(Object obj){
		this.arrayStack.add(obj);
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

	public ImprovedStack reverse() {
		ImprovedStackImpl reversedStack = ImprovedStackImpl();


		return reversedStack;
	}

	public void remove(Object obj) {
		
	}

}