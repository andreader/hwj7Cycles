public class Main {
    static int task;

    public static void t() {
        task++;
        System.out.println();
        System.out.println("Task №" + task);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Homework 1");
        t();
        int save = 0;
        int month = 0;
        while (save <= 2_459_000) {
            month++;
            save += 15000;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей. %n", month, save);
        }
        System.out.println("Всего месяцев = " + month);
        System.out.println("Всего накоплений = " + save);
        t();
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i1 = 10; i1 >= 1; i1--) {
            System.out.print(i1 + " ");
        }
        System.out.println();
        t();
        int population = 12_000_000;
        int birth = 17 * population / 1000;
        int death = 8 * population / 1000;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + birth - death;
            System.out.printf("Год %s, численность населения составляет %s. %n", year, population);
        }
        System.out.println();
        System.out.println("Homework 2");
        t();
        int total = 0;
        int interest = 7;
        int i1 = 1;
        while (total < 12_000_000) {
            i1++;
            total += 15000;
            total = total + interest * total / 100;
            System.out.printf("Месяц %s, сумма накоплений составляет %s. %n", i1, total);
        }
        System.out.println("Всего месяцев = " + i1);
        System.out.println("Всего накоплений = " + total);
        t();
        int total2 = 0;
        int interest2 = 7;
        int i2 = 1;
        while (total2 <= 12_000_000) {
            i2++;
            total2 += 15000;
            total2 = total2 + interest2 * total2 / 100;
            if (i2 % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений составляет %s. %n", i2, total2);
            }
        }
        System.out.println("Всего месяцев = " + i2);
        System.out.println("Всего накоплений = " + total2);
        t();
        int total3 = 0;
        int interest3 = 7;
        int i3 = 1;
        while (i3 <= 9 * 12) {
            i3++;
            total3 += 15000;
            total3 = total3 + interest3 * total3 / 100;
            if (i3 % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений составляет %s. %n", i3, total3);
            }
        }
        System.out.println("Всего месяцев = " + i3);
        System.out.println("Всего накоплений = " + total3);
        t();
        int friday = 7;
        int i4 = 1;
        while (i4 <= 31) {
            i4++;
            if (i4 % friday == 0) {
                System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет. %n", i4);
            }
        }

        t();
        int currentYear = 2022;
        int before200 = currentYear - 200;
        int after100 = currentYear + 100;
        do {
            before200++;
            if (before200 % 79 == 0) {
                System.out.println(before200);
            }
        } while (before200 <= after100);

        t();
        System.out.println("С помощью do-while");
        int x = 2;
        int y = 1;
        int z = 0;
        do {
            z = x * y;
            System.out.printf("%s * %s = %s. %n",x,y,z);
            y++;
        } while (y <=10);
        System.out.println("С помощью for");
        for (y = 1; y <= 10; y++) {
            z = x * y;
            System.out.printf("%s * %s = %s. %n",x,y,z);
        }
    }
}

