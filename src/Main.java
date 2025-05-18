import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача Первая");
        int salary = 15000;
        int target = 2459000;
        int total = 0;
        int months = 0;
        while (total <= target) {
            total += salary;
            months++;
            System.out.println("Месяц " + months + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Понадобится месяцев: " + months);

        System.out.println();
        System.out.println("Задача Вторая");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задача Третья");
        int totalPopulation = 12_000_000;
        for (i = 1; i <= 10; i++) {
            int born = totalPopulation / 1000 * 17;
            int death = totalPopulation / 1000 * 8;
            System.out.println("Год " + i + ", численность населения составляет " + totalPopulation);
            totalPopulation += (born - death);

        }
        System.out.println();
        System.out.println("Задача Четвертая");
        long deposit = 15_000;
        long mission = 12_000_000;
        int percent = 7;
        months = 0;

        while (deposit < mission) {
            deposit = deposit + deposit * percent / 100;
            months++;
            System.out.println("Сумма накопления за " + months + " месяц: " + deposit + " рублей");
        }
        System.out.println();
        System.out.println("Задача Пятая");
        deposit = 15_000;
        mission = 12_000_000;
        percent = 7;
        months = 0;
        while (deposit < mission) {
            deposit = deposit + deposit * percent / 100;
            months++;
            if (months % 6 == 0) {
                System.out.println(months + " месяц сумма накоплений " + deposit);
            }
        }
        System.out.println();
        System.out.println("Задача Шестая");
        months = 0;
        deposit = 15000;
        while (months <= 108) {
            deposit = deposit + deposit * percent / 100;
            months++;
            if (months % 6 == 0) {
                System.out.println(months + " месяц сумма накоплений " + deposit);
            }
        }
        System.out.println();
        System.out.println("Задача Седьмая");
        months = 31;
        for (int day = 3; day <= months; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();
        System.out.println("Задача Восьмая");
        int currentYear = 2025;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometPeriod = 79;
        for (int year = startYear; year <= endYear; year++) {
            if (year % cometPeriod == 0) {
                System.out.println(year);
            }
        }
    }
}