public class Intern extends Employee{
    public Intern(int id, String name, double stipend) {
        super(id, name, stipend);
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary();
    }

    @Override
    public void displayDetails() {
        System.out.println("\nRole: Intern");
        super.displayDetails();
        System.out.println("Stipend: " + getBasicSalary());
    }
}
