public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(95.6,187);
        System.out.println("Ваш интекс массы тела: " + bmi);
    }
}
