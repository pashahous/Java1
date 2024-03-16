package gb.sem1.levl2.les1;

public class DayOfWeek {
    /*Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заданному текущему дню.

 Возвращает кол-во оставшихся рабочих часов до конца
 недели по заданному текущему дню. Считается, что
 текущий день ещё не начался, и рабочие часы за него
 должны учитываться.
 Если заданный день выходной то вывести "Сегодня выходной"


public class DayOfWeekMain {

 public static void main(String[] args) {
 System.out.println(getWorkingHours(DayOfWeek.MONDAY));
 }*/
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DaysOfWeekEnum.Saturday));
        System.out.println(getWorkingHours(DaysOfWeekEnum.Friday));
        System.out.println(getWorkingHours(DaysOfWeekEnum.Thursday));
        System.out.println(getWorkingHours(DaysOfWeekEnum.Monday));
    }

    public static Integer getWorkingHours(DaysOfWeekEnum currentDay) {
        int hours = currentDay.getHourOfWork();
        if(hours <=0) {
            return hours;
        }
        for (DaysOfWeekEnum d : DaysOfWeekEnum.values()) {
            if (currentDay.compareTo(d) < 0) {
                hours += d.getHourOfWork();
            }
        }
        return hours;

    }

}
