package HomWork7.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CalculatorLogger implements ICalculatorLogger{
    @Override
    public void logger(String string) {
        try {
            File logFile = new File("logCalculator.txt");
            FileWriter fileWriter = new FileWriter(logFile, true);

            fileWriter.write(string);
            fileWriter.close();

        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }
}