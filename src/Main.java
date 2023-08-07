public class Main {
    public static void main(String[] args) {
        int initialBalance = 1000;
        int addend = 400;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый баланс:" + finalBalance);
        System.out.println("начисленные Бонусы за покупку:" + bonus);
    }
}