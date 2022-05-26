public class BmiService {
    public double calculate(double weight, double growth) {
        double growth2 = growth * growth / 10_000;
        double bmi = weight / growth2;
        return bmi;
    }
}
