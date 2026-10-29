
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        service.addEmployee(sc);
                        break;

                    case 2:
                        service.displayAllEmployees();
                        break;

                    case 3:
                        service.searchEmployee(sc);
                        break;

                    case 4:
                        System.out.println("Thank you for using the system!");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
                choice = 0;
            }

        } while (choice != 4);

        sc.close();
    }
}
