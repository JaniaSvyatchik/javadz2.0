public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676; //стоимость билета
        int bonusValue = 20; //стоимость бонуса

        int miles = ticketPrice / bonusValue; //кол-во начисленных миль

        System.out.println("Начислены бонусные мили:");
        System.out.println(miles);
    }
}
