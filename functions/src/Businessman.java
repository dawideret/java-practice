public class Businessman {
    private String name;
    private int age;
    private String address;
    private long credit_card;
    private int salary;

    public void setInformation(String Name, int Age, String Address, long Credit_Card, int Salary) {
        this.name = Name;
        this.age = Age;
        this.address = Address;
        this.credit_card = Credit_Card;
        this.salary = Salary;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public long getCredit_card() {
        return credit_card;
    }
    public int getSalary() {
        return salary;
    }
    public void printInformation() {
        System.out.println(name + "\n" + age + "\n" + address + "\n" + credit_card + "\n" + salary);
    }
}