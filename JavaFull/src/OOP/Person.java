package OOP;

public class Person {
    private String name;
    private String dob;
    private int age;

    public Person() {
        name="No Name";
        dob="Empty";
        age=0;
    }

    public Person(String name, String dob, int age) {
        this.name = name;
        this.dob = dob;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String showInfo() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                '}';
    }
}
