public class Q2 {
    public static void main(String[] args) {
        byte b = 100;            // 1 byte
        short s = 10000;        // 2 bytes
        int i = 100000;         // 4 bytes
        long l = 100000L;       // 8 bytes
        float f = 10.5f;        // 4 bytes
        double d = 10.5;        // 8 bytes
        char c = 'A';           // 2 bytes
        boolean bool = true;    // 1 bit

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bool);
    }
}
