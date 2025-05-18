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
        int startPopulation = 12_000_000;
        int born = startPopulation / 1000 * 17;
        int death = startPopulation / 1000 * 8;
        int totalPopulation = startPopulation + born + death;
        for (i = 1; i <= 10; i++) {
            totalPopulation += (born - death);
            System.out.println("Год " + i + " численность населения составляет " + totalPopulation);

        }
        System.out.println();
        System.out.println("Задача Четвертая");
        double deposit = 15000.0;
        double percent = 0.07;
        double mission = 12_000_000.0;
        int monts = 0;

        while (deposit < mission) {
            deposit = deposit + deposit * percent;
            months++;
            System.out.println("Сумма накопления за " + monts + " месяц " + deposit + " рублей");
        }
    }
}