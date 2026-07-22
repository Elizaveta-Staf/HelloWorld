class Hello3 {
    public static void main (String[] args) {
        System.out.println(calcCircleRadius(123));
    }

    public static double calcCircleRadius(double area) {
        return Math.sqrt(area / Math.PI);
    }
}