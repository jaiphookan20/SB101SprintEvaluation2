package Question1;

public class TicketCounter {
	
	int availableSeats = 3;
	

	public synchronized void bookSeat(String name, int numberOfSeats) throws NoSeatAvailableException {
		
		if ((numberOfSeats <= this.availableSeats) && (numberOfSeats > 0)) {
			System.out.println(numberOfSeats + " tickets booked for " + name);
			this.availableSeats -= numberOfSeats;
			System.out.println("availableSeats: " + this.availableSeats);
		}
		else {
			
			throw new NoSeatAvailableException();
		}
	}
	
}


class NoSeatAvailableException extends Exception {
	
	public NoSeatAvailableException() {
		System.out.println("The number of tickets sought were not available");
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