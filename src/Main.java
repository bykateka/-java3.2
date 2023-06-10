public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int replenishment = 900;
        int bonus = balance + replenishment / 100;
        int nobonus = replenishment + balance;
        if (replenishment > 1000) {
            System.out.println(bonus);
        } else {
            System.out.println(nobonus);
        }
    }
}