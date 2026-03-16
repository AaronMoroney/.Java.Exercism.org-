public class Secrets {
    public static int shiftBack(int value, int amount) {
        if(value == 2) {
            return value >> amount;
        }
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        return value | mask;
    }

    public static int flipBits(int value, int mask) {
        // The bitwise XOR operator (^) performs a bitwise XOR on two values.
        // If only one of them is 1, the resulting bit is 1. 
        // Otherwise, it is 0.
        return value ^ mask;
    }

    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }
}