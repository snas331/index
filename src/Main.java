public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 2;
        int weight = 90;
        int bodyMassIndex = service.calculate(weight,m); // должно получиться
        System.out.println(bodyMassIndex);
    }
}