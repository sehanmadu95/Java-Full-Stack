package OOP;

public class SchoolBoy extends Person{

    private String grade;
    private String school;


    public SchoolBoy() {
        grade="11-B";
        school="Lourdes";
        setName("SHEHAN");
    }

    public SchoolBoy(String name, String dob, int age, String grade, String school) {
        super(name, dob, age);
        this.grade = grade;
        this.school = school;
    }

    @Override
    public String showInfo() {
        return "SchoolBoy{" +
                "grade='" + grade + '\'' +
                ", school='" + school + '\'' +

                "name='" + getName() + '\'' +
                ", dob='" + getDob() + '\'' +
                ", age=" +getAge() +

                '}';
    }


}
