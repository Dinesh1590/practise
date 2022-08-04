package practise;

public class Employee {
    private String name;
    private int id;
    private int age;
    private double salary;

    Employee(String name, int id, int age, int salary) {

        this.age = age;
        this.id = id;
        this.name = name;
        this.salary = salary;

    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return
                name + " " +
                        id + " " +
                        age + " "
                        + salary;
    }


}
