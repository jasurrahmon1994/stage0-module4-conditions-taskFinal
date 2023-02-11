package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean isLeap = year % 400 == 0 ? true : year % 100 == 0 ? false : year % 4 == 0 ? true : false;
        int feb = isLeap ? 29 : 28;
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 2 -> System.out.println(feb);
            case 4, 6, 9, 11 -> System.out.println(30);
            default -> System.out.println("invalid date");
        }
    }
}
