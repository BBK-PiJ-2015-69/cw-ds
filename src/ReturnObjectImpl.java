/**
* Implementation of Return Object
* When we carry out an operation on a data stuture
* This wrapper can contain an object or an error
* @author Luke Jones
*/

public class ReturnObjectImpl implements ReturnObject {

	private ErrorMessage errDetails;
	private Object obj;

	// CONSTRUCTORS
	public ReturnObjectImpl() {
		this.obj = null;
		this.errDetails = null;
	}

	public ReturnObjectImpl(Object obj) {
		this.obj = obj;
		this.errDetails = null;
	}

	// GETTERS
	public ErrorMessage getErrorM() {
		return errDetails;
	}

	public Object getObject() {
		return obj;
	}

	// SETTERS
	public void setErrorM(ErrorMessage errDetails) {
		this.errDetails = errDetails;
	}

	public void setObject(Object obj) {
		this.obj = obj;
	}

	// RETURNS TRUE IF ERROR
	public boolean hasError() {
		if (this.errDetails == ErrorMessage.NO_ERROR || this.errDetails == null) {
			return false;
		} else {
			return true;
		}
	}

	// RETURNS ERROR MESSAGE
	public ErrorMessage getError() {
		if (this.hasError() == false) {
			return ErrorMessage.NO_ERROR;
		} else {
			return this.errDetails;
		}
	}

	/*
	* REUTNRS OPERATION RESULT
	* OBJECT (WRAPPED IN RETURNOBJECT)
	*/
	public Object getReturnValue() {
		if (this.hasError() == true) {
			return null;
		}
		return this.obj;
	}

	//TO STRING
	public String toString() {
		if(this.obj != null){
			return this.obj + ": " + this.errDetails;
		}else{
			return "NULL: " + this.errDetails;
		}
	}

}