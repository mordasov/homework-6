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
        int paymentNew = 29000; //еж-мес платеж на вклад 1го числа
        int totalDeposit = 0; //сумма с которой начисляется %% в конце месяца (на 31- число)
        int percents; //сумма начисленных процентов за месяц
        int totalPercents = 0; //сумма %% накопительным итогом

        for (int i = 1; i <= 12; i++) {
            totalDeposit = totalDeposit + paymentNew; //положили 29 000 в начале месяца
            percents = totalDeposit/100; // начислили %% в конце месяца
            totalDeposit = totalDeposit + percents; // добавили начисленные %%
            totalPercents = totalPercents + percents; //считаем начисленные %% накопительным итогом

            System.out.println("Месяц " + i + ", начислены %% = " + percents +
                    ", сумма накоплений = " + totalDeposit + " рублей.");
        }

        System.out.println("Вклад закрыт, общая сумма на депозите - " + totalDeposit);
        System.out.println("Общая сумма начисленных процентов - " + totalPercents);
        System.out.println("\n");

        //task-10
        for (int i = 1; i <= 10; i++) {
            int sum = 2 * i;
            System.out.println("2*" + i + "=" + sum);
        }
    }
}