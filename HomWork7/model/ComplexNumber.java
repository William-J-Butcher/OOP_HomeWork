package HomWork7.model;

public class ComplexNumber {
    private double a;
    private double bi;

    public ComplexNumber(double a, double bi) {
        this.a = a;
        this.bi = bi;
    }

    public double getA() {
        return a;
    }

    public double getBi() {
        return bi;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setBi(double bi) {
        this.bi = bi;
    }

    @Override
    public String toString() {
        double first = a;
        double second = bi;
        return first + " + " + second + "i";
    }
}