package ServerExceptionTicketbooking;

public class BookingTest {
    public static void main(String[] args) {
        // Create a ServerConnection instance
        ServerConnection serverConnection = new ServerConnection();

        // Create a BookingSystem instance with the server connection
        BookingSystem bookingSystem = new BookingSystem(serverConnection);

        // Define ticket details
        String ticketDetails = "Passenger: John Doe, Train: XYZ123, Date: 2024-11-20";

        try {
            // Try to book the ticket
            bookingSystem.bookTicket(ticketDetails);
        } catch (ServerErrorException e) {
            // Handle server error and refund ticket
            System.err.println("Server error: " + e.getMessage());
            bookingSystem.refundTicket();
        } catch (BookingException e) {
            // Handle booking error
            System.err.println("Booking error: " + e.getMessage());
        }
    }
}
