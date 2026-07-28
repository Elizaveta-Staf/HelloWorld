class Hello {

    public static void main(String[] args) {
        System.out.println(isWeekend("Saturday")); // true
        System.out.println(isWeekend("Monday"));   // false
    }

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Saturday":
            case "Sunday":
                return true;
            default:
                return false;
        }
    }
}