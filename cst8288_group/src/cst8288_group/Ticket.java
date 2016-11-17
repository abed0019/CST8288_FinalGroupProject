package cst8288_group;
//comment

public class Ticket {

	public Ticket(Concert concert, double ticketprice){
		this.ticketprice=ticketprice; 
		this.ticketID = UniqueID.getInstance();//this is autogenerated;s
		this.concert = concert;
	}
	public Ticket(){
		this(new Concert("blank concert"), 0.0d);
	}

	/**
	 * @return the concert
	 */
	public Concert getConcert() {
		return concert;
	}
	/**
	 * @param concert the concert to set
	 */
	public void setConcert(Concert concert) {
		this.concert = concert;
	}
	
	/**
	 * @param ticketID the ticketID to set
	 */
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	public void setTicketPrice(double ticketprice){
		this.ticketprice=ticketprice; 
	}

	public double getTicketPrice(){
		return ticketprice; 
	}

	public void setTicketID(Integer ticketID){
		this.ticketID=ticketID; 
	}
	public int getTicketID(){
		return ticketID; 
	}
	
	private Concert concert;
	private double ticketprice;
	private int ticketID; 
	
	
	private static class UniqueID{
		private static int uid = 0;
		public static int getInstance(){
			uid++;
			return uid;
		}
	}
	public void displayTicket(){
		System.out.println(concert);
		System.out.println("Ticket price: "+ ticketprice + " Ticket ID: "+ ticketID);
	}
}
