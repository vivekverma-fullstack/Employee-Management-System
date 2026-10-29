public class Manager extends Employee{
    private double allowance;

    public Manager(int id, String name, double basicSalary, double allowance){
        super(id, name, basicSalary);
        this.allowance = allowance;
    }
    @Override 
    public double calculateSalary(){
        return getBasicSalary() + allowance;
    }
    @Override 
    public void displayDetails(){
        System.out.println("//Manager//");
        displayDetails();
        System.out.println("Allowance: "+allowance);
    }
}
