/**
* Functional Array implementation of the List interface
* These extra methods will let us recursively use lists
** ReturnObject: We need this to handle errors such as calls to null list
* because this course has not yet taught exceptions
* @author Luke Jones
*/

public class FunctionalArrayList extends ArrayList implements FunctionalList {

	private final int HEAD_INDEX = 0;

	public FunctionalArrayList(int defaultSize){
		super(defaultSize);
	}

	public FunctionalArrayList(Object[] sourceArray){
		super(sourceArray);
	}

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

	public FunctionalArrayList rest(){
		FunctionalArrayList rest = new FunctionalArrayList();


		return rest;
	}

}