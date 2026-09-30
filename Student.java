class Student {

    private String name;
    private int id;
    private double gpa;
    private double feesPaid;
    private double feesTotal;
    private double remainingFees;
    private static int numOfStudent;

    Student(String name, int id, double gpa) {
        setName(name);
        setId(id);
        setGpa(gpa);
        feesPaid = 0;
        feesTotal = 30000;
        numOfStudent+=1;

    }

    public void setName(String name) {
        name = name.trim();
        if (name.length() >= 3 && name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {

            throw new IllegalArgumentException("Invalid name");
        }
    }

    public void setId(int id){
        if(id>0){
            this.id=id;
        }
        else{
            throw new IllegalArgumentException("Id must be a positive number");
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4) {
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
    }

    public void updateFeesPaid(double fees) {
        if (fees > 0) {
            feesPaid += fees;
            School.updateTotalMoneyEarnd(feesPaid);
        } else {
            throw new IllegalArgumentException("Fees must be a positive number");
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }

    public double getRemainingFees() {
        return feesTotal - feesPaid;
    }

    public String toString() {
        return "Name: " + name + "   Id: " + id + "   Gpa: " + gpa;
    }

    public  static int numOfStudent(){
        return numOfStudent;
    }


}