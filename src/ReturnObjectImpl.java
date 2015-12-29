/**
* An Array implementation of the interface
*
* @author Luke Jones
*/

public class ReturnObjectImpl implements ReturnObject {

	private ErrorMessage errDetails;
	private Object obj;

	public ReturnObjectImpl() {
		this.object = null;
		this.error = null;
	}

	public ReturnObjectImpl(Object obj) {
		this.object = obj;
		this.error = null;
	}

	public ErrorMessage getErrorM() {
		return errDetails;
	}

	public void setErrorM(ErrorMessage errDetails) {
		this.errDetails = errDetails;
	}

	public Object getObject() {
		return obj();
	}

	public setObject(Object returnObj) {
		this.obj = obj;
	}

	public Object getReturnValue() {
		if (this.hasError() == true) {
			return null;
		}
		return this.obj;
	}

	public boolean hasError() {
		if (this.errDetails == ErrorMessage.NO_ERROR || this.errDetails == null) {
			return false;
		} else {
			return true;
		}
	}

	public ErrorMessage getError() {
		if (this.hasError() == false) {
			return ErrorMessage.NO_ERROR;
		} else {
			return this.errDetails;
		}
	}

}