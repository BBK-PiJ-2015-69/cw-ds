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




/* ------------------ */



//---//---//---//---//---//----//---//---//---//-----//---//----
//* SOME TESTING OBJECTS FOR FUNCTIONAL LINKED AND ARRAY LISTS *
//---//---//---//---//---//----//---//---//---//-----//---//----

		
		TestingObj test1 = new TestingObj(1);
		TestingObj test2 = new TestingObj(2);
		TestingObj test3 = new TestingObj(3);
		TestingObj test4 = new TestingObj(4);
		TestingObj test5 = new TestingObj(5);


		/** ARRAY LIST Tests **/

		System.out.println("-**---**---**-");
		System.out.println("TESTING: ARRAY LIST");
		System.out.println("-**---**---**-");





//---//---//---//---//---//----
//* Functional Array List *
//---//---//---//---//---//----

// LET'S MAKE OUR FUNCTIONAL ARRAY LIST ;)
		FunctionalArrayList funcArrayList = new FunctionalArrayList();

		System.out.println("Empty; Current Items: " + Integer.toString(funcArrayList.size()));
		System.out.println("Gives no error" + funcArrayList.toString());
		System.out.println("- - -");

// Error if POP element from EMPTY stack
///////		


////
// ADD OBJECTS

// Some array list building
		ReturnObject testObj1 = funcArrayList.add(0, " So adding this to index 1");
		System.out.println("Current status -> " + funcArrayList.toString());
		System.out.println("- - -");

//ACCEPT MANY TYPES :. let's try object to index
		testObj1 = funcArrayList.add(2, " Attempt to add this to index 2");


// Types - Boolean
		testObj1 = funcArrayList.add(1, new Boolean(true));
		System.out.println("Added a Boolean with result true");

		System.out.println("Check if error ->" + testObj1.getError());

		System.out.println("Current status -> " + funcArrayList.toString());
		System.out.println("- - -");

//If not null, creates a new abstract stack using the provided list
		System.out.println("If I try to add object: " + test1 + "- " + funcArrayList.add(test1).getError());


		System.out.println("Check if error ->" + testObj1.getError());

		System.out.println("Current status -> " + funcArrayList.toString());

		System.out.println("FAL: " + funcArrayList);	
// GET SIZE
		System.out.println("Size: " + funcArrayList.size() + ", Head: " + funcArrayList.head() + ", Rest: " + funcArrayList.rest());
		System.out.println("- - -");

		testObj1 = funcArrayList.add(" -- Third Addition ");

		System.out.println("Check if error ->" + testObj1.getError());

		System.out.println("Current status -> " + funcArrayList.toString());
		System.out.println("- - -");


		System.out.println("FAL: " + funcArrayList);	
		System.out.println("Size: " + funcArrayList.size() + ", Head: " + funcArrayList.head() + ", Rest: " + funcArrayList.rest());
		System.out.println("- - -");

		testObj1 = funcArrayList.remove(1);
		System.out.println("Removed Index 2 -> " + testObj1.toString());

		System.out.println("Check if error ->" + testObj1.getError());

// POPPING ??
		System.out.println("Get return second index " + funcArrayList.get(0).getReturnValue());

		System.out.println("Check if error ->" + testObj1.getError());

// ADDING
		System.out.println("Add object to index 3: " + test2 + "- " + funcArrayList.add(3, test2));

		System.out.println("Current status -> " + funcArrayList.toString());

		System.out.println("Check if error ->" + testObj1.getError());		

		System.out.println("Get return first index -> " + funcArrayList.get(1).getReturnValue());

		System.out.println("Check if error ->" + testObj1.getError());

		System.out.println("Current status -> " + funcArrayList.toString());
		System.out.println("- - -");

		testObj1 = funcArrayList.remove(1);
		System.out.println("Attempt to remove index 1 again " + testObj1.toString());

		System.out.println("Check if error ->" + testObj1.getError());

		System.out.println("Current status -> " + funcArrayList.toString());
		System.out.println("- - -");
/* Check whether the provided list is null.
* If a null list is provided, a NullPointerException will be thrown at runtime 
* as soon as any operation is attempted on the underlying list. 
*/
		System.out.println("Let's got for NULL - see if error -> " + funcArrayList.add(null).getError());

		System.out.println("FAL: " + funcArrayList);	
		System.out.println("Size: " + funcArrayList.size() + ", Head: " + funcArrayList.head() + ", Rest: " + funcArrayList.rest());

		System.out.println("Check if error ->" + testObj1.getError());

		System.out.println("Current status -> " + funcArrayList.toString());

		System.out.println("If I try to remove an object at index 0: " + funcArrayList.remove(0).getReturnValue());
		
		System.out.println("FAL: " + funcArrayList);	
		System.out.println("Size: " + funcArrayList.size() + ", Head: " + funcArrayList.head() + ", Rest: " + funcArrayList.rest());

		System.out.println("Check if error ->" + testObj1.getError());

		System.out.println("Current status -> " + funcArrayList.toString());



/* ---------------- */




//---//-----
//* FUNCTIONAL LINKED LIST *
//---//-----


		System.out.println("-**---**---**-");
		System.out.println("TESTING: FUNCTIONAL LINKED LIST");
		System.out.println("-**---**---**-");

		/** LINKED LIST Tests **/
// LET'S MAKE OUR FUNCTIONAL LINKED LIST ;)

		FunctionalLinkedList funcLinkedList = new FunctionalLinkedList();

//TYPES - try adding object
		System.out.println("If I try to add object: " + funcLinkedList.add(test1));

		System.out.println("Current status -> " + funcLinkedList.toString());
		System.out.println("- - -");

// If Empty return true, else false
		System.out.println("Empty? " + funcLinkedList.isEmpty());

//Check size		
		System.out.println("Size: " + funcLinkedList.size());

		System.out.println("Call index 0 -> " + funcLinkedList.get(0));

		System.out.println("Check if error ->" + testObj1.getError());

		System.out.println("Current status -> " + funcArrayList.toString());
		System.out.println("- - -");

		System.out.println("Add object to index 1 -> " + funcLinkedList.add(1, test2));

		System.out.println("Check if error ->" + testObj1.getError());

		System.out.println("Current status -> " + funcArrayList.toString());
		System.out.println("- - -");
		
// Call to Head
		System.out.println("Head: " + funcLinkedList.head());
		
// Call to Rest
		System.out.println("Rest: " + funcLinkedList.rest().toStringAll());

// Error if POP element from EMPTY stack
///////		



/* ---------------- */



//---//---//---//---//---//----
//* SAMPLEABLE LIST *
//---//---//---//---//---//----

		System.out.println("-**---**---**-");
		System.out.println("TESTING: SAMPLEABLE LIST");
		System.out.println("-**---**---**-");

		SampleableList sList = new SampleableListImpl();

// An empty list if the list is empty. public class TEST_SampleableList{


//Try adding some different types

//Interger - to index 0
		
		System.out.println("Adding Interger - to index 0");

		ReturnObject testObj4 = sList.add(0, new Integer(7));
		
		System.out.println("Current Status" + sList.sample().toString());

//Add Boolean
		
		System.out.println("Adding Boolean - index not defined");

		testObj4 = sList.add(new Boolean(true));
		
		System.out.println("Current Status" + sList.sample().toString());

//String - direct to index 2
		
		System.out.println("Adding string - to index 2");

		testObj4 = sList.add(2, "Sweet Chilli Sauce");
		
		System.out.println("Current Status" + sList.toString());

//Adding string with no index defined	
		
		System.out.println("Adding string - no index defined");

		testObj4 = sList.add("Honey Nut Cornflakes");
		
		System.out.println("Current Status" + sList.toString());

// SAMPELABLE LIST: Returns a list containing the first, third, fifth... items of this list
		
		/** END: SAMPLEABLE LIST **/



/* ------------------ */







/* ------------------ */



//---//---//---//---//---//---
//* Error Message  *
//---//---//---//---//---//---


// If message NO_ERROR, if no there is no error. (Test this? Called by ReturnObject)
		ErrorMessage errorMsgOne = ErrorMessage.NO_ERROR;
		System.out.println("Error Message is ->  " + errorMsgOne);

/* If message EMPTY_STRUCTURE returned 
* when the programmer tries to retrieve an element from an empty data structure.
*/
		errorMsgOne = ErrorMessage.EMPTY_STRUCTURE;
		System.out.println("Error Message is ->  " + errorMsgOne);

/* If message INDEX_OUT_OF_BOUNDS produced 
* when the programmer tries to insert an element on a negative index of a list.
*/
		errorMsgOne = ErrorMessage.INDEX_OUT_OF_BOUNDS;
		System.out.println("Error Message is ->  " + errorMsgOne);
		// you can set an enumerated type to null
		errorMsgOne = null;
		System.out.println("Error Message is ->  " + errorMsgOne);
		//now let's set it to something else!

/* If message INVALID_ARGUMENT when the programmer 
* tries to insert a null element in a list that does not allow null elements.
*/
		errorMsgOne = ErrorMessage.INVALID_ARGUMENT;
		System.out.println("Error Message is ->  " + errorMsgOne);
		
// Testing of equality with enumerated types

/* NO ERROR
* Boolean result true or false for comparisons
* If errorMsgTwo equals errorMsgOne (above)
* Used both double equals and .equals; should be same result
*/
		ErrorMessage errorMsgTwo = ErrorMessage.NO_ERROR;
		System.out.println(Boolean.toString(errorMsgTwo.equals(errorMsgOne)));
		System.out.println(Boolean.toString(errorMsgTwo == errorMsgOne));

// Show result
		System.out.println(errorMsgTwo.toString());

/* INVALID ARGUMENT
* Boolean result true or false for comparisons
* If errorMsgTwo equals errorMsgOne (above)
* Used both double equals and .equals; should be same result
*/
		errorMsgTwo = ErrorMessage.INVALID_ARGUMENT;
		System.out.println(Boolean.toString(errorMsgTwo.equals(errorMsgOne)));
		System.out.println(Boolean.toString(errorMsgTwo == errorMsgOne));
		
// Show result
		System.out.println(errorMsgTwo.toString());

// Dump HASH to screen
		System.out.println(errorMsgTwo.hashCode());



/* ------------------ */



//---//---//---//---//-----
//* RETURN OBJECT *
//---//---//---//---//-----



// HAS ERROR: Returns whether there has been an error




// GET ERROR: Returns error message




// Must return NO_ERROR if and only if {@hasError} returns false.




/* GET RETURN VALUE: Returns the object wrapped in this ReturnObject, i.e. the
* result of the operation if it was successful, or null if
* there has been an error.
*/




/* Note that the output of this method must be null if {@see
* hasError} returns true, but the opposite is not true: if
* {@see hasError} returns false, this method may or may not return null.
*/
		
	}
}