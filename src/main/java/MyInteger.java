public class MyInteger {
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return (value % 2 == 0);
    }

    public boolean isOdd() {
        return (value % 2 != 0);
    }

    public boolean isPrime() {
        boolean check = true;
        if (value < 2) {
            check = false;
        } else {
            for (int i = 2; i < Math.sqrt(value); i++) {
                if (value % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public static boolean isEven(int value) {
        return (value % 2 == 0);
    }

    public static boolean isOdd(int value) {
        return (value % 2 != 0);
    }

    public static boolean isPrime(int value) {
//        int count = 0;
//        for (int i = value; i < 0; i--) {
//            count++;
//        }
//        if (count == 2) {
//            return true;
//        }
//        return true;
        boolean check = true;
        if (value < 2) {
            check = false;
        } else {
            for (int i = 2; i < Math.sqrt(value); i++) {
                if (value % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public static boolean isEven(MyInteger number) {
        return (number.value % 2 == 0);
    }

    public boolean isOdd(MyInteger number) {
        return (number.value % 2 != 0);
    }

    public boolean isPrime(MyInteger number) {
        boolean check = true;
        if (number.value < 2) {
            check = false;
        } else {
            for (int i = 2; i < Math.sqrt(number.value); i++) {
                if (number.value % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public boolean equals(int number) {
        return (this.value == number);
    }

    public boolean equals(MyInteger number) {
        return (this.value == number.value);
    }

    public static int parseInt(char charactor) {
        return Character.getNumericValue(charactor);
    }

    public static int parseInt(String string) {
        return Integer.parseInt(string);
    }

    @Override
    public String toString() {
        String result = "";
        if(this.isEven(this.value)) {
            result += this.value + " is even";
        } else {
            result += this.value + " is odd";
        }

        if(this.isPrime(this.value)) {
            result += "\n" + this.value + " is prime";
        }

        return result;

    }
}
