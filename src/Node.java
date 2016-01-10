/**
* My bespoke data structure .....Meet the NODE :-o
* @author Luke Jones
*/

public class Node {
	private int position;
	private Object object;
	private Node next;
	private Node prev;
	
	public Node(){
		this.object = null;
		this.next = null;
		this.prev = null;
	}
	/**
	 * Constructor method for node
	 * creates new node with given value
	 * sets next & previous nodes to null.
	 * @param new value to assign to node
	 */
	public Node(Object previous, Object current){
		this.object = current;
		this.next = null;
		this.prev = prev;
	}
	
	/**
	 * Gets the value current objects value
	 * @return value of this object
	 */
	public Object getObject() {
		return this.object;
	}
	/**
	 * Sets a new value to current object
	 * @param new value of this object
	 */

	public Node getNext() {
		return this.next;
	}

	/**
	 * Gets the previous node to current node
	 * @return previous node
	 */
	public Node getPrev() {
		return this.prev;
	}


	/**
	 * Empty constructor method for node
	 * In case I need temporary nodes for methods
	 */

	public void setObject(Object object) {
		this.object = object;
	}


	/**
	 * Set the next node in the list
	 * @param node to set as next
	 */

	public void setNext(Node next) {
		this.next = next;
	}
	/**
	 * Set the previous node in the list
	 * @param node to set as previous
	 */
	public void setPrevious(Node prev) {
		this.prev = prev;
	}

	/**
	 * Returns the String value of the current node
	 */
	public String toString(){
		return this.object.toString();
	}
}