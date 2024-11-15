package ServerExceptionTicketbooking;

public class ServerConnection {
    public void connectToServer() throws ServerErrorException {
        // Simulate server response logic
        boolean serverErrorOccurred = simulateServerError();

        if (serverErrorOccurred) {
            throw new ServerErrorException("Failed to connect to the server. Please try again later.");
        }
        // If no error, continue with successful connection logic
        System.out.println("Connected to the server successfully.");
    }

    private boolean simulateServerError() {
        // Simulate a 50% chance of server error for demonstration purposes
        return Math.random() < 0.5;
    }
}
