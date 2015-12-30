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
		this.object = null;
		this.error = null;
	}

	public ReturnObjectImpl(Object obj) {
		this.object = obj;
		this.error = null;
	}

	// GETTERS
	public ErrorMessage getErrorM() {
		return errDetails;
	}

	public Object getObject() {
		return obj();
	}

	// SETTERS
	public void setErrorM(ErrorMessage errDetails) {
		this.errDetails = errDetails;
	}

	public setObject(Object returnObj) {
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
			return this.obj + ": " + this.error;
		}else{
			return "NULL: " + this.error;
		}
	}

}