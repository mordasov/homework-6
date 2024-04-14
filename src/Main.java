public class Main {
    public static void main(String[] args) {

        //task-1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //task-2
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //task-3
        for (int i = 0; i < 17; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        //task-4
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //task-5
        for (int i = 1904; i <= 2096; i +=4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        //task-6
        for (int i = 7; i <= 98; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //task-7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //task-8
        int payment = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += payment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println();

        //task-9
        int paymentNew = 29000;
        int totalNew = 0;
        int percents;
        for (int i = 1; i <= 12; i++) {
            percents = totalNew * 12 / 12 / 100; //начислен %% по вкладу за предыдущий месяц (12% годовых)
            totalNew += (paymentNew + percents);
            System.out.println("Месяц " + i + ", начислены %% = " + percents +
                    ", сумма накоплений = " + totalNew + " рублей.");
        }
        System.out.println();

        //task-10
        for (int i = 1; i <= 10; i++) {
            int sum = 2 * i;
            System.out.println("2*" + i + "=" + sum);
        }
    }
}