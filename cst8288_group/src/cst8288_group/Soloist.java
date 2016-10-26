package cst8288_group;



											
/**
 * Soloist Class
 * A person who performs a given composition ( 0 to many )
 * Has an identification number
 * Has an area of expertise
 * Committee records soloist's full name, address & phone number
 * Last performance date is recorded
 * 
 * @author    Zobayed Abedin
 * @version   1.0.0 October 25, 2016
 */



public class Soloist extends Person {

	
	
	
	
	/* CONSTRUCTORS	--------------------------------------------------	*/
	
	public Soloist (String givenName, String middleName, String familyName, Address homeAddress, int phoneNumber) {
		
		super(givenName, middleName, familyName, homeAddress, phoneNumber);
		
		setSoloistID(soloistID);
		
	}
	
	
	

	/**
	 *	Paramertized constructor.
	 *	@param	value	Some attribute value.
	 */




	/* ACCESSORS	-----------------------------------------------------	*/
	
	
	
	/**
	 * Soloist ID getter method - returns the unique ID of a Soloist
	 * 
	 */
	
	public String getSoloistID() {
		
		return this.soloistID;
		
	}


	/**
	 * Soloist expertise getter method -  returns the area of expertise of a soloist ( e.g, sax player, fluist )
	 * 
	 */
	
	public String getSoloistExpertise(){
		
		return this.expertise;
		
	}

	
	
	
	
	/* MODIFIERS	-----------------------------------------------------	*/
	
	
	/**
	 * Sets soloist's unique ID. Combination of Letters and Numbers. 
	 *
	 */
	
	public void setSoloistID(String id) {
		
		this.soloistID = id;
		
	}
	
	
	/**
	 * Sets soloist's area of expertise (e.g. sax player, fluist). 
	 *
	 */
	
	public void setSoloistExpertise ( String expt){
		
		this.expertise = expt;
		
	}

	
	
	

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	
	


	/**
	 *	Convert this class to a meaningful string.
	 *	@return	This class as a meaningful string.
	 */



	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.												*/


	
	

	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 * Entry point "main()" as required by the JVM.
	 * @param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */




	/* ATTRIBUTES	-----------------------------------------------------	*/
	/* TODO:	Place Attributes here.													*/
	
	
	private String soloistID;
	
	private String expertise;


}	/*	End of CLASS:	*/