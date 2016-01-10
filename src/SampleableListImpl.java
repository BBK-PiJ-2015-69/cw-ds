/**
* A Sampleable extention of Array List to implement SampleableList
* Allows use of either ArrayLists or LinkedLists to make a sampleable list
* @author Luke Jones
*/

public class SampleableListImpl extends ArrayList implements SampleableList {

	private List list;

	// CONSTRUCTOR
	public SampleableListImpl() {
		this.list = null;
	}

	public SampleableListImpl(List list) {
		this.list = list;
	}

	// SETTER
	public void setList(List list) {
		this.list = list;
	}

	// GETTER
	public List getList() {
		return this.list;
	}

	// RETURNS SAMPLE OF LIST (EMPTY IF EMPTY LIST)
	// FIBONACCI
	public SampleableList sample() {
		SampleableListImpl newSampleList = new SampleableListImpl();
		ArrayList placeholder = new ArrayList();
		if(this.list != null) {
			int j = 0;
			for (int i = 1; i < list.size(); i+=j) {
				placeholder.add(list.get((i-1)).getReturnValue());
				j = i;
			}
			newSampleList.setList(placeholder);
		}
		return newSampleList;
	}

	// TO STRING
	public String toString() {
		String listString = new String();
		if (list != null){
			for (int i = 0; i < list.size(); i++) {
				listString += list.get(i).getReturnValue();
			}
		}
		return listString;
	}

}