package JavaSelfeduOOP.l14;

public class Person {
    private static Integer MAX_AGE_WEIGHT = 200;
    private static Integer MIN_AGE_WEIGHT = 30;
    private Integer weight;
    private Integer age;
    private Integer grade;
    private String FIO;

    public Person(Integer weight, Integer age, Integer grade, String FIO) {
        this.weight = weight;
        this.age = age;
        this.grade = grade;
        this.FIO = FIO;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
}
