////---//---//-------------------
// TESTS // Time for some cricket
////---//---//-------------------
public class TEST_MAIN{
	public class TestingObj{
		private int figure;
		
		public String toString(){
			String testingFigure = Integer.toString(this.figure) + " ";
			return testingFigure;
		}
		
		public int getInt(){
			return this.figure;
		}
		
		public TestingObj(int figure){
			this.figure = figure;
		}
	}
	
	
	public static void main(String[] args){
		TEST_MAIN cricket = new TEST_MAIN();
		cricket.run();
	}
	
	public void run(){

//---//-----
//* ARRAY LIST *
//---//-----

// MAKE THE LISTY
		System.out.println("Welcome, let's create a new ArrayList");
		ArrayList testAL = new ArrayList();


// There is no limit to the number of elements in the list

/* ADD with INT and OBJECT parameters: Adds an element to the list, inserting it at the given position. 
* The indeces of elements at and after that position must be updated accordignly.
* :.
* Add integer
*/

// The first element in the list is at index 0
		System.out.println("Adding an integer to position 7");
		ReturnObject testObj = testAL.add(0, new Integer(7));

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

/* A list can store objects of any kind, and they can be of different types: 
* Integers, Doubles, String, or even other lists. 
*/
//ADD a string now 
		System.out.println("Adding text - string");
		testObj = testAL.add(1, "Greetings my fellow citizens");

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

//ADD more types: Boolean
		System.out.println("Adding Boolean now");
		testObj = testAL.add(new Boolean(true));

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

//ADD with only OBJECT parameter: Adds an element at the end of the list.
		System.out.println("Adding text - strings; didn't define indices");

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

		testObj = testAL.add("Aliens stole my car");

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

		testObj = testAL.add("Party like it's 1066");

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

// BOOLEAN ISEMPTY: Returns true if the list is empty, 
// False otherwise.


// GET > INT INDEX: Returns the element at the given position - encapsulated in a ReturnObject


// ADD more

		System.out.println("We have five items - instead of end, add French greeting to index 2");
		testObj = testAL.add(1, "Salut. Ca va?");

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

/* REMOVE: Returns the elements at the given position and removes it
* from the list. The indeces of elements after the removed
* element must be updated accordignly.
*/
		testObj = testAL.remove(3);
		System.out.println("Removed item at index 3 (Party like it's 1066)");

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

/* If the index is negative or greater or equal than the size of
* the list, then an appropriate error must be returned.
*/
		
		System.out.println("Let's remove index one");
		testObj = testAL.remove(1); //this doesn't remove index one, just 2 and 3, and clones index 1 ???!

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

 
/* If a null object is provided to insert in the list, the
* request must be ignored and an appropriate error must be returned.
*/
// This list cannot store null objects.
		System.out.println("Let's try for null");
		testObj = testAL.add(null);

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());


// SIZE: Returns the number of items currently in the list.
		System.out.println("Size: " + Integer.toString(testAL.size()));

		System.out.println("Let's try to remove index one again even though not there and see if error");
		testObj = testAL.remove(1); //it just removes last item ?

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

		System.out.println("Let's remove index zero");
		testObj = testAL.remove(0); //it just removes last item ?

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

// Error if remove an element from an empty list
// Error uf renove element from a position where there is nothing.
		
		System.out.println("Try to push to empty stack");
		testObj = testAL.add(2, "ABC 123");

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Current status: " + testAL.toString());

/* If the index is negative or greater or equal than the size of the list, 
* then an appropriate error must be returned - encapsulated in a ReturnObject
*/		System.out.println("Try to push to negative index");
		testObj = testAL.add(-2, "Cider or beer; maybe wine");

		System.out.println("Check for error");
		System.out.println(testObj.getError());

		System.out.println("Size: " + Integer.toString(testAL.size()));

		System.out.println(testAL.toString());

		
	}
}