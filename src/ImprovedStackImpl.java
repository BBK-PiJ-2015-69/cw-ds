/**
* Implementation of the Improved Stack
* Incrased number of methods
* The base data structure for storage will be List 
* ReturnObject: We need this to handle errors such as calls to null list
* because this course has not yet taught exceptions
* @author Luke Jones
*/

public class ImprovedStackImpl implements ImprovedStack {

	// SET LIST
	private List list;

	// CONSTRUCTORS
	public ImprovedStackImpl(){
		this.list = null;
	}

	public ImprovedStackImpl(List list){
		this.list = list;
	}

	// GETTER
	public List getList(){
		return this.list;
	}	

	/*
	* SIZE
	* RETURNS OF NUMBER OF ITEMS IN STACK
	*/
	public int size(){
		if(list != null){
			return list.size();
		}else{
			return 0;
		}
	}

	// TRUE IF STACK EMPTY
	public boolean isEmpty(){
		if(list != null){
			if(list.isEmpty() == true) {
				return true;
			}
		}
		return false;
	}

	/*
	* PUSH
	* ADDS ELEMENT TO TOP OF THE STACK
	*/
	public void push(Object obj){
		if(list != null){
			list.add(obj);
		}
	}
	
	/*
	* POP
	* RETURNS TOP ITEM IN STACK
	* BUT UNLIKE POP (BELOW) DOESN'T REMOVE IT
	*/ 
	public ReturnObject top() {
		ReturnObjectImpl top = new ReturnObjectImpl();
		if(list != null){ //alternately if(super.isEmpty()){
			if(list.size() != 0){
				int size = (list.size() - 1);
				top.setErrorM(list.get(size).getError());
				top.setObject(list.get(size).getReturnVal()); //obj.setObject(super.getValue(0));
			}else{
				top.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			}
		}else{
			top.setErrorM(ErrorMessage.NO_ERROR); //is this an empty structure? or no error?
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
		if(list != null){ //alternately if(super.isEmpty()){
			if(list.size() != 0){
				int size = (list.size() - 1);
				pop.setErrorM(list.get(size).getError());
				pop.setObject(list.get(size).getReturnVal()); //obj.setObject(super.getValue(0));
			}else{
				pop.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			}
		}else{
			pop.setErrorM(ErrorMessage.NO_ERROR); //is this an empty structure? or no error?
		}
		return pop;
	}

	/* 
	* REVERSE
	* RETURNS STACK WITH ITEMS REVERSED
	* SWITCHES TOP WITH BOTTOM, ETC.
	*/
	public ImprovedStack reverse() {
		ArrayList reversedList = new ArrayList();
		ImprovedStackImpl reversedStack = new ImprovedStackImpl(reversedList);
		if(list != null){
			int size = list.size();
			for (size = 0; size >=0; size--){
				reversedList.add(list.get(size).getReturnVal());
			}
		}
		return reversedStack;
	}

	/* 
	* REMOVE
	* REMOVES THE OBJECT FROM STACK
	* IF MULIPLE TIMES, ALL DELETED
	*/
	public void remove(Object obj) {
		if(list != null){
			for (int i=0; i < list.size(); i++) {
				if (list.get(i).getReturnVal().equals(obj)) {
					list.remove(i);
					remove(obj);
				}
			}
		}
	}

	// TO STRING
	public String toString(){
		String listString = new String();
		if(list != null){
			for (int i = 0; i < list.size(); i++) {
				listString += list.get(i).getReturnVal();
			}
		}
		return listString;
	}

}