package ServerExceptionTicketbooking;

public class BookingSystem {
    private double accountBalance = 100.00;  // Simulate user's account balance (in dollars)
    private final double ticketPrice = 50.00;  // Price of a ticket

    private ServerConnection serverConnection;

    // Constructor
    public BookingSystem(ServerConnection serverConnection) {
        this.serverConnection = serverConnection;
    }

    public void bookTicket(String ticketDetails) throws ServerErrorException, BookingException {
        // Deduct ticket price from user's account
        accountBalance -= ticketPrice;
        System.out.println("Ticket price deducted. Current balance: $" + accountBalance);

        // Try connecting to the server
        serverConnection.connectToServer();

        // Simulate booking process
        boolean bookingErrorOccurred = simulateBookingError();

        if (bookingErrorOccurred) {
            throw new BookingException("Failed to book the ticket due to an internal error. Please try again.");
        }

        // If booking is successful
        System.out.println("Ticket booked successfully for: " + ticketDetails);
    }

    private boolean simulateBookingError() {
        // Simulate a 30% chance of booking error for demonstration purposes
        return Math.random() < 0.3;
    }

    // Method to refund the ticket amount
    public void refundTicket() {
        accountBalance += ticketPrice;  // Add back the ticket price to the account balance
        System.out.println("Ticket money refunded. Updated balance: $" + accountBalance);
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}