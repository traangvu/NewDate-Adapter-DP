public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();

        date.setYear(2025);
        date.setMonth(4);
        date.setDay(20);

        System.out.println("Initial date: " + date.getYear() + "-" + date.getMonth() + "-" + date.getDay());

        date.advanceDays(10);
        System.out.println("Date after advancing 10 days: " + date.getYear() + "-" + date.getMonth() + "-" + date.getDay());

        date.advanceDays(25);
        System.out.println("Date after advancing 25 more days: " + date.getYear() + "-" + date.getMonth() + "-" + date.getDay());
    }
}
