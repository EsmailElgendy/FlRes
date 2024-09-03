import com.airline.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightReservationService service = new FlightReservationService();
        UserService userService = new UserService();
        userService.initialUsers();

        String user, pass;
        System.out.println("Welcome to reservation system");
        System.out.println("Please enter your username: ");
        user = scanner.nextLine();
        System.out.println("Please enter your password: ");
        pass = scanner.nextLine();


        SystemUser loggedInUser = userService.check(user, pass);
        if (loggedInUser != null) {
            System.out.print("! Welcome " + loggedInUser.getUsername() + ", You have successfully logged in" );

            if (loggedInUser.getUserType() == UserType.ADMIN) {
                System.out.println(" as Admin");
                System.out.println("Please select an option: ");
                System.out.println("1. Create a new flight");
                System.out.println("2. Modify a flight");
                System.out.println("3. Delete a flight");
                System.out.println("4. Exit");
                int expression = scanner.nextInt();
                switch(expression) {
                    case 1:
                        // Add flight

                        Flight flight = new Flight();
                        System.out.println("Please enter flight number: ");
                        flight.setFlightNumber(scanner.nextInt());
                        System.out.println("Please enter  flight Type (Domestic/International): ");
                        flight.setFlightType(FlightType.valueOf(scanner.nextLine()));
                        System.out.println("Please enter departure airport: ");
                        flight.setFrom (scanner.nextLine());
                        System.out.println("Please enter arrival airport: ");
                        flight.setTo(scanner.nextLine());
                        System.out.println("Please enter departure date: ");
                        flight.setDate(scanner.nextLine());
                        System.out.println("Please enter departure time: ");
                        flight.setTime(scanner.nextLine());
                        // Display the entered flight details
                        System.out.println("Flight Details:");
                        System.out.println("Flight Number: " + flight.getFlightNumber());
                        System.out.println("Flight Type: " + flight.getFlightType());
                        System.out.println("Departure Airport: " + flight.getFrom());
                        System.out.println("Arrival Airport: " + flight.getTo());
                        System.out.println("Departure Date: " + flight.getDate());
                        System.out.println("Departure Time: " + flight.getTime());

                        break;
                    case 2:
                        // Modify flight
                        System.out.println("Please enter  Old flight number: ");
                        scanner.nextLine(); // Consume newline
                        flight.setFlightNumber(scanner.nextInt());
                        System.out.println("Please enter New flight number: ");
                        flight.setFlightNumber(scanner.nextInt());
                        System.out.println("Please enter  flight Type (Domestic/International): ");
                        scanner.nextLine(); // Consume newline
                        flight.setFlightType(FlightType.valueOf(scanner.nextLine()));
                        System.out.println("Please enter departure airport: ");
                        flight.setFrom (scanner.nextLine());
                        System.out.println("Please enter arrival airport: ");
                        flight.setTo(scanner.nextLine());
                        System.out.println("Please enter departure date: ");
                        flight.setDate(scanner.nextLine());
                        System.out.println("Please enter departure time: ");
                        flight.setTime(scanner.nextLine());
                        // Display the entered flight details
                        System.out.println("Flight Details:");
                        System.out.println("Flight Number: " + flight.getFlightNumber());
                        System.out.println("Flight Type: " + flight.getFlightType());
                        System.out.println("Departure Airport: " + flight.getFrom());
                        System.out.println("Arrival Airport: " + flight.getTo());
                        System.out.println("Departure Date: " + flight.getDate());
                        System.out.println("Departure Time: " + flight.getTime());

                        break;
                    case 3:
                        // Delete flight

                        break;
                    case 4:
                        // Exit

                    default:
                        // Invalid option
                }
                // Admin specific actions


            } else if (loggedInUser.getUserType() == UserType.PASSENGER) {
                System.out.println(" as Passenger");
                // Passenger specific actions
            }
        } else {
            System.out.println("Wrong credentials!");
        }

    }


}