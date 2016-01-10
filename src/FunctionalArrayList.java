/**
* Functional Array implementation of the List interface
* These extra methods will let us recursively use lists
** ReturnObject: We need this to handle errors such as calls to null list
* because this course has not yet taught exceptions
* @author Luke Jones
*/

public class FunctionalArrayList extends ArrayList implements FunctionalList {

	// HEAD INDEX TO ZERO
	//private final int HEAD_INDEX = 0;

	// CONSTRUCTORS
	public FunctionalArrayList(){
		super();
	}
	/*
	public FunctionalArrayList(int defaultSize){
		super(defaultSize);
	}

	public FunctionalArrayList(Object[] sourceArray){
		super(sourceArray);
	}*/

	/*
	* HEAD
	* RETURNS FIRST ELEMENT IN LIST
	*/
	public ReturnObjectImpl head(){
		ReturnObjectImpl obj = new ReturnObjectImpl();
		if(super.getObject() == null){
			obj.setErrorM(ErrorMessage.EMPTY_STRUCTURE);
			return obj;
		}else{
			obj.setObject(super.get(0).getReturnValue());
			obj.setErrorM(ErrorMessage.NO_ERROR);
		}
		return obj;
	}


	/*
	* REST
	* RETURNS NEW LIST WITH ALL ELEMENTS OF FORMER, IN ORDER, EXCEPT WITHOUT THE HEAD
	* ORIGINAL LIST UNAFFECTED
	*/
	public FunctionalArrayList rest(){
		FunctionalArrayList rest = new FunctionalArrayList();
		if(super.getObject() != null){
			for (int i =1; i <= super.size(); i++) {
				rest.add(super.getElement(i));
			}
		}
		return rest;
	}

}