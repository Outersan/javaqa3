public class BmiService {
    public double calculate(double weight, double height){

        return weight / ((height / 100) * (height / 100));
    }
}
