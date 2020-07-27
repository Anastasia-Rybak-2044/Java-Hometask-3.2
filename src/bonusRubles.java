public class bonusRubles {
    public static void main(String[] args) {
        int balanceStart = 300;
        int fundsAdded = 1500;

        int bonus;
        if (fundsAdded >= 1000) {
            bonus = fundsAdded / 100;
        } else {
            bonus = 0;
        }

        int balanceEnd = balanceStart + fundsAdded + bonus;
        System.out.println("Сумма на Вашем счете составляет " + balanceEnd + " рублей");
    }
}
