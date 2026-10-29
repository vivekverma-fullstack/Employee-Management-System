
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.println("Employee ID already exists!");
                return;
            }
        }

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Select Employee Type:");
        System.out.println("1. Manager");
        System.out.println("2. Developer");
        System.out.println("3. Intern");
        System.out.print("Enter choice: ");

        int type = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Basic Salary / Stipend: ");
        double salary = Double.parseDouble(sc.nextLine());

        if (salary < 0) {
            System.out.println("Salary cannot be negative!");
            return;
        }

        Employee employee;

        switch (type) {
            case 1:
                System.out.print("Enter Allowance: ");
                double allowance = Double.parseDouble(sc.nextLine());

                if (allowance < 0) {
                    System.out.println("Allowance cannot be negative!");
                    return;
                }

                employee = new Manager(id, name, salary, allowance);
                break;

            case 2:
                System.out.print("Enter Bonus: ");
                double bonus = Double.parseDouble(sc.nextLine());

                if (bonus < 0) {
                    System.out.println("Bonus cannot be negative!");
                    return;
                }

                employee = new Developer(id, name, salary, bonus);
                break;

            case 3:
                employee = new Intern(id, name, salary);
                break;

            default:
                System.out.println("Invalid employee type!");
                return;
        }

        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("--------------------------");
        }
    }

    public void searchEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.println("Employee found:");
                e.displayDetails();
                return;
            }
        }

        System.out.println("Employee not found!");
    }
}
