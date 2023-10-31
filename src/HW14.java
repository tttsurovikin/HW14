import java.util.Random;

public class HW14 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000011 - 11) + 11;
        int sum = 0;

        System.out.println("Згенероване число: " + number);

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Сума розрядів: " + sum);
    }
}
