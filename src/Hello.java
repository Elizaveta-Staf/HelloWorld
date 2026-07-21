public class Hello {

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.drawsMonitorsCounter(10, 3));
    }

    public int drawsMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }
}