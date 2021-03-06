package symphony.domain;									

import java.util.ArrayList;

/**
 * Composition Class
 * A Composition is an original instrumental piece of music to be performed in a Concert (0 to many)
 * A Composer selects Compositions with the Committee & gives name and number to Movements.
 * A Composition may have 0 to many Movements.
 * 
 * @author    Ash-Lee Hommy
 * @version   1.0.0 October 23rd, 2016
 */
public class Composition extends ConcertEntity{

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * Default constructor for Composition
	 */
	public Composition() {
		super();
	}
	/**
	 * Overloaded constructor for adding a Composition with no movements
	 * @param id the Composition identification number
	 * @param name the name of the Composition as set by the Composition
	 * @param composer the Composer of the Composition
	 */
	public Composition(String id, String name, String composer) {
		super(id, name);
		setComposer(composer);
		movementList = new ArrayList<Movement>();
	}
	/**
	 * Overloaded constructor for adding a Composition with movements
	 * @param id the Composition identification number
	 * @param name the name of the Composition as set by the Composition
	 * @param composer the Composer of the Composition
	 * @param movements the list of Movements within the Composition
	 */
	public Composition(String id, String name, String composer, ArrayList<Movement> movements) {
		setID(id);
		setName(name);
		setComposer(composer);
		setMovementList(movements);
		
		}

	/* ACCESSORS	-----------------------------------------------------	*/

	/**
	 * Composer getter method - may change to a Composer object?
	 * @return the Composer as a String (for now)
	 */
	public String getComposer() {
		return composer;
	}
	/**
	 * List of movements getter method
	 * @return - a list of the Movements in the Composition as an ArrayList
	 */
	public ArrayList<Movement> getMovementList() {
		return movementList;
	}


	/* MODIFIERS	-----------------------------------------------------	*/

	/**
	 * Composer setter method - sets composer with a String param (for now)
	 * @param composer the Composer of the Composition
	 */
	public void setComposer(String composer) {
		this.composer = composer;
	}
	/**
	 * Movement List setter method - sets ArrayList of Movements within a Composition (0 to many) with an ArrayList<Movement> param
	 * @param movements the list of movements within the composition
	 */
	public void setMovementList(ArrayList<Movement> movements) {
		movementList = movements;
	}


	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Overriding the parent toString method to a meaningful String
	 * @return Composition as a meaningful String
	 */
	@Override
	public String toString() {
		return "[ " 
				+ "compositionID=" + getID() 
				+ " compositionName=" + getName()
				+ " composer=" + getComposer()
				+ " movementList=" + getMovementList()
				+ " ]";
	}



	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.												*/
	
	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 * Entry point "main()" as required by the JVM. Invoked first and
	 *	either instantiates a ServerWrapper object and invokes startMain directly, or
	 * uses the WrapperManager to start the ServerWrapper object.
	 * @param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	public static void main (String args[]) {
		/*Movement mov1 = new Movement("TheFirst", 1);
		Movement mov2 = new Movement("TheFirst", 2);
		Movement mov3 = new Movement("Movement", 1);
		
		ArrayList<Movement> testMovementsList = new ArrayList<Movement>();
		testMovementsList.add(mov1);
		testMovementsList.add(mov2);
		testMovementsList.add(mov3);
		
		Composition comp1 = new Composition();
		Composition comp2 = new Composition("Comp2id", "SecondComposition", "Mr.Composer");
		Composition comp3 = new Composition("CompMov3id", "MovementComposition", "Mr.Composer", testMovementsList);
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		System.out.println(comp3.toString());*/
	}


	/* ATTRIBUTES	-----------------------------------------------------	*/

	/**
	 * The composer of the Composition 
	 * <br>Represented as a private String (for now)
	 */
	private String composer; 
	/**
	 * The list of Movements within the Composition (0 to many)
	 * 
	 * <br>Represented as a private ArrayList of Movement Objects
	 */
	private ArrayList<Movement> movementList;	
	



}	/*	End of CLASS:	Composition.java			*/

