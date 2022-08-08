package Question1;

class TicketBooking extends Thread {
	
	private TicketCounter ticketCounter;
	private String passengerName; 
	private int noOfSeatsToBook;
	
	public TicketBooking(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBook) {
		super();
		this.ticketCounter = ticketCounter;
		this.passengerName = passengerName;
		this.noOfSeatsToBook = noOfSeatsToBook;
	}
	
	@Override
	public void run() {
		try {
			ticketCounter.bookSeat(passengerName, noOfSeatsToBook);
		} 
		
		catch (NoSeatAvailableException e) {	
			e.printStackTrace();
		}
	}
	
	
}