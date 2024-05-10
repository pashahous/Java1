package d5;

import java.util.Date;

public class Car {
    private String color;
    private  String model;
    private Date dateOfcreate;

    public Car(String color, String model, Date dateOfcreate) {
        this.color = color;
        this.model = model;
        this.dateOfcreate = dateOfcreate;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDateOfcreate() {
        return dateOfcreate;
    }

    public void setDateOfcreate(Date dateOfcreate) {
        this.dateOfcreate = dateOfcreate;
    }
}
