class Teacher {

    private String name;
    private int id;
    private double salary;

    Teacher(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void updateSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            School.updateTotalMoneySpent(salary);
        } else {
            throw new IllegalArgumentException("Salary must be positive number");
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    public String toString(){
        return "Name: "+name+"   Id: "+id+"   Salary: "+salary;
    }

}