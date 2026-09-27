class Teacher {

    private String name;
    private int id;
    private double salary;

    Teacher(String name, int id, double salary) {
        setName(name);
        setId(id);
        updateSalary(salary);
    }

    public void setName(String name) {
        name = name.trim();
        if (name.length() >= 3 && name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {

            throw new IllegalArgumentException("Invalid name");
        }

    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Id must be a positive number");
        }
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

    public String toString() {
        return "Name: " + name + "   Id: " + id + "   Salary: " + salary;
    }

}