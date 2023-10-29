import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        CalculatorIMC calculatorIMC = new CalculatorIMC();

        try {
            calculatorIMC.calculateW();
        }catch (InputMismatchException e){
            System.out.println("Você digitou algo errado... Reinicie o programa e tente novamente.");
        }
    }
}