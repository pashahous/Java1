package gb.sem1.levl2.les1;

public enum DaysOfWeekEnum {


    Monday("понедельник",8),
    Tuesday ("вторник",8),
    Wednesday ("среда",8),
    Thursday("четверг",8),
    Friday("пятница",7),
    Saturday("суббота",0),
    Sunday("воскресенье",0);
    private final String rusName;
    private final int hourOfWOrk;
    public String getRusName() {
        return rusName;
    }

    public int getHourOfWork() {
        return hourOfWOrk;
    }

    DaysOfWeekEnum(String rusName, int hourOfWOrk) {
        this.rusName = rusName;
        this.hourOfWOrk = hourOfWOrk;
    }
}
