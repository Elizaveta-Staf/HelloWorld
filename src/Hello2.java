class Hello {

    public static void main(String[] args) {
        System.out.println(getAgeDiff((byte)2, (byte)5));
        System.out.println(getAgeDiff((byte)4, (byte)1));
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) Math.abs(age1 - age2);
    }
}