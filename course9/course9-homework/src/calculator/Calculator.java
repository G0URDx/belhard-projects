package calculator;

public class Calculator {
    public Calculator() {

    }

    public double divide(double devidend, double devider) throws DivisionByZeroException {
        if (devider == 0) {
            throw new DivisionByZeroException("Devider is 0!");
        }
        return devidend / devider;
    }

}
