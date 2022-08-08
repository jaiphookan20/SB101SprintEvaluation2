package Question1;

public class Main {

	public static void main(String[] args) {
		
		TicketCounter ticketObj = new TicketCounter();
		
		TicketBooking thread1 = new TicketBooking(ticketObj, "Jai", 2);
		TicketBooking thread2 = new TicketBooking(ticketObj, "Shreya", 1);
		TicketBooking thread3 = new TicketBooking(ticketObj, "Shaswati", 3);
		
		thread1.start();
		
		try {
			thread1.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		thread2.start();
		
		try {
			thread2.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		try {
			thread3.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		thread3.start();
		
	}

}




/* 

Create a TicketCounter class which has following field and method:

● availableSeats = 3;
● void bookSeat(String name, int numberOfSeats)

bookSeat() is used to check availability of seats and book the seats. If there is no sufficient seat then throw
NoSeatAvailableException else update the availableSeats and print the number of seats booked.

Create a Thread class TicketBooking which has following field:
● ticketCounter : TicketCounter
● passengerName : String
● noOfSeatsToBook : int

Create a Main class with the main method and create one TicketCounter object and three TicketBooking threads
then start all the threads.

*/