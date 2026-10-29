public class Developer extends Employee{
    private double bonus;
        public Developer(int id, String name, double basicSalary, double bonus) {
        super(id, name, basicSalary);
        this.bonus = bonus;
    }
    @Override 
    public double calculateSalary(){
        return getBasicSalary() + bonus;
    }
    @Override
    public void displayDetails() {
        System.out.println("\nRole: Developer");
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
    }
}
