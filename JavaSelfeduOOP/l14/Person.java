package JavaSelfeduOOP.l14;

public class Person {
    private static final Integer MAX_AGE_WEIGHT = 200;
    private static final Integer MIN_AGE_WEIGHT = 30;
    private Integer weight;
    private Integer age;
    private Integer grade;
    private String FIO;

    public Person(Integer weight, Integer age, Integer grade, String FIO) {
        if (isValidWeight(weight))
            this.weight = weight;
        if (isValidAge(age))
            this.age = age;
        if (isValidGrade(grade))
            this.grade = grade;
        if (isValidFIO(FIO))
            this.FIO = FIO;
    }

    private boolean isValidFIO(String fio) {
        String[] arrayFIO = fio.split(" ");
        for (String string : arrayFIO) {
            if (!isWordWithLetters(string)) return false;


        }
        return true;
    }

    private boolean isWordWithLetters(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isLetter(c)) return false;
        }
        return true;

    }

    private boolean isValidGrade(Integer grade) {
        return 1 <= grade && grade <= 5;
    }

    private boolean isValidAge(Integer age) {
        return 5 <= age && age <= 100;

    }

    private boolean isValidWeight(Integer weight) {
        return MIN_AGE_WEIGHT <= weight && weight <= MAX_AGE_WEIGHT;
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
