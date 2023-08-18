package HomWork7.model;
public class Calculator {
    private ComplexNumber primaryArg;

    public Calculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    public ComplexNumber addition(ComplexNumber complexNumber) {
        primaryArg.setA(primaryArg.getA() + complexNumber.getA());
        primaryArg.setBi(primaryArg.getBi() + complexNumber.getBi());
        return primaryArg;
    }

    public ComplexNumber subtraction(ComplexNumber complexNumber) {
        primaryArg.setA(primaryArg.getA() - complexNumber.getA());
        primaryArg.setBi(primaryArg.getBi() - complexNumber.getBi());
        return primaryArg;
    }

    public ComplexNumber multiplication(ComplexNumber complexNumber) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.setA(primaryArg.getA() * complexNumber.getA() - primaryArg.getBi() * complexNumber.getBi());
        temp.setBi(primaryArg.getBi() * complexNumber.getA() + primaryArg.getA() * complexNumber.getBi());
        primaryArg = temp;
        return primaryArg;
    }

    public ComplexNumber division(ComplexNumber complexNumber) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.setA((primaryArg.getA() * complexNumber.getA() + primaryArg.getBi() * complexNumber.getBi())
                / (complexNumber.getA() * complexNumber.getA() + complexNumber.getBi() * complexNumber.getBi()));
        temp.setBi((primaryArg.getBi() * complexNumber.getA() - primaryArg.getA() * complexNumber.getBi())
                / (complexNumber.getA() * complexNumber.getA() + complexNumber.getBi() * complexNumber.getBi()));
        primaryArg = temp;
        return primaryArg;
    }

    public ComplexNumber getResult() {
        return primaryArg;
    }
}