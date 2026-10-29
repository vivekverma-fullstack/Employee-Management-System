class Employee{
    private int id;
    private String name;
    private double basicSalary;
    Employee(int id, String name, double basicSalary){
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getBasicSalary(){
        return basicSalary;
    } 
    public double calculateSalary(){
        return basicSalary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}