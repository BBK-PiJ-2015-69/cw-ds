/**
* A Sampleable extention of Array List to implement SampleableList
*
* @author Luke Jones
*/

public class SampleableListImpl extends ArrayList implements SampleableList {

	public SampleableListImpl() {
		super();
	}

	public SampleableList sample() {

		SampleableListImpl newSampleList = new SampleableListImpl();
		int currentSize = this.size();

		if(currentSize > 0) {

			Object[placeholder] = new Object[(currentSize / 2) + (currentSize % 2)];
			int j = 0;
			for (int i = 0; i < placeholder.length; i++) {
				placeholder[i] = this.get(j).getReturnValue();
				j = j +2;
			}
			newSampleList.setList(placeholder);
		}
		return newSampleList;

	}

}