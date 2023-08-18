package HomWork7.view;

import HomWork7.model.*;

import java.util.Scanner;

public class CalculatorView implements ICalculatorView{
    private final ICalculatorFactory icalculatorFactory;
    private final ICalculatorLogger icalculatorLogger;
    public CalculatorView(ICalculatorFactory icalculatorFactory, ICalculatorLogger icalculatorLogger) {
        this.icalculatorFactory = icalculatorFactory;
        this.icalculatorLogger = icalculatorLogger;
    }
    @Override
    public void run() {
        while (true) {
            ComplexNumber primaryArg = promptComplexNumber("Введите первый аргумент в формате \"a + bi\": ");
            Calculator calculator = icalculatorFactory.create(primaryArg);
            icalculatorLogger.logger(primaryArg + "\n");
            while (true) {
                String cmd = prompt("Введите команду (+, -, *, /, =) : ");
                icalculatorLogger.logger(cmd + "\n");
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент в формате \"a + bi\": ");
                    icalculatorLogger.logger(arg + "\n");
                    calculator.addition(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент в формате \"a + bi\": ");
                    icalculatorLogger.logger(arg + "\n");
                    calculator.subtraction(arg);
                    continue;
                }
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент в формате \"a + bi\": ");
                    icalculatorLogger.logger(arg + "\n");
                    calculator.multiplication(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент в формате \"a + bi\": ");
                    icalculatorLogger.logger(arg + "\n");
                    calculator.division(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    icalculatorLogger.logger(result + "\n");
                    icalculatorLogger.logger("----------------------------------\n");
                    System.out.println(result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private ComplexNumber promptComplexNumber(String string) {
        Scanner in = new Scanner(System.in);
        ComplexNumber cn = new ComplexNumber(0, 0);
        System.out.println(string);
        System.out.print("a: ");
        cn.setA(Integer.parseInt(in.nextLine()));
        System.out.print("b: ");
        cn.setBi(Integer.parseInt(in.nextLine()));
        return cn;
    }
}