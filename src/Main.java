public class Main {
    public static void deliveryDaysCheck(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance <= 20) {
            day = 1;
            System.out.println("Потребуется дней: " + day);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = 2;
            System.out.println("Потребуется дней: " + day);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = 3;
            System.out.println("Потребуется дней: " + day);
        }
    }

    public static void main(String[] args) {
        int deliveryDistance = 62;
        deliveryDaysCheck(deliveryDistance);
    }
}
