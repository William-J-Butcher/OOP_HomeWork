package HomWork7.controller;

import HomWork7.model.CalculatorFactory;
import HomWork7.model.CalculatorLogger;
import HomWork7.model.ICalculatorFactory;
import HomWork7.model.ICalculatorLogger;
import HomWork7.view.CalculatorView;
import HomWork7.view.ICalculatorView;

public class CalculatorController {

    ICalculatorFactory icalculatorFactory;
    ICalculatorLogger icalculatorLogger;
    ICalculatorView icalculatorView;
    public CalculatorController() {
        this.icalculatorFactory = new CalculatorFactory();
        this.icalculatorLogger = new CalculatorLogger();
        this.icalculatorView = new CalculatorView(icalculatorFactory, icalculatorLogger);
    }

    public void run(){
        icalculatorView.run();
    }
}