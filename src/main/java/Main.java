import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int count = service.calcSqrService(100, 400);
        System.out.println("Количество чисел, при возведении в квадрат: " + count);
    }
}
