public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 43;
        double height = 168;
        double bmi = service.calculate(height, weight);

        System.out.println(bmi);
    }
}