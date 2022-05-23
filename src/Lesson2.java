public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(sumRange(1, 20));
        negativePositiveNumberPrint(-5);
        System.out.println(negativPositivNumberBool(-2));
        printConsolString("Hello", 6);
        System.out.println(leapYearVerification(1500));
    }

    public static Boolean sumRange(int sum1, int sum2) {
        return sum1 + sum2 >= 10 && sum1 + sum2 <= 20;
    }

    public static void negativePositiveNumberPrint(int number) {
        if (number >= 0)
            System.out.println("Число положительное 1");
        else
            System.out.println("Число отрицательное");
    }

    public static Boolean negativPositivNumberBool(int number) {
        return number < 0;
    }

    public static void printConsolString(String str, int quantityTimes) {
        for (int i = 0; i < quantityTimes; i++) {
            System.out.println(str);
        }
    }

    public static Boolean leapYearVerification(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }


}
