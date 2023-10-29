import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatorIMC {

    String heightS;
    String weightS;
    double weight;
    double height;
    Scanner sc = new Scanner(System.in);

    public void calculateW() {
        System.out.print("\nDigite o seu peso: ");
        weightS = sc.nextLine();
        weightS = weightS.replace(",", ".");
        weight = Double.parseDouble(weightS);

        if (weight >= 200) {
            wheightMax();
        }
        if (weight <= 9.99) {
            wheightMin();
        } else {
            calculateH();
        }
    }

    public void calculateH() {
        System.out.print("Digite sua altura (em centímetros): ");
        heightS = sc.nextLine();
        heightS = heightS.replace(",", ".");
        height = Double.parseDouble(heightS);
        BigDecimal hF = new BigDecimal(height);
        String hFS = String.format("%.0f", hF);
        String hFSI = hFS.substring(0, 1);
        String hFSD = hFS.substring(1);
        String hFSC = hFSI + "," + hFSD;

        if (height < 100) {
            heightMin();
        } else if (height > 220) {
            heightMax();
        } else {
            System.out.print("\nPeso        Altura");
            System.out.printf("%n%.2f kg    %s m", weight, hFSC);
            imc();
        }
    }

    public void wheightMax() {
        while (weight >= 200) {
            System.out.printf("Peso de \"%.2f KG\" está acima do limite dessa aplicação... Tente novamente", weight);
            calculateW();
        }
    }

    public void wheightMin() {
        while (weight <= 9.99) {
            System.out.printf("Peso de \"%.2f KG\" está abaixo do limite dessa aplicação, o peso mínimo é 10 kg ", weight);
            calculateW();
        }
    }

    public void heightMin() {
        if (height < 100) {
            while (height < 100) {
                System.out.println("\nA altura mínima para essa calculadora é de 100 cm");
                calculateH();
            }
        }
    }

    public void heightMax() {
        if (height > 220) {
            while (height > 220) {
                System.out.println("\nA altura máxima para essa calculadora é de 220 cm");
                calculateH();
            }
        }
    }

    public void imc() {
        double height2 = (height * height) / 10000;
        double imcResult = weight / height2;
        double IMC;
        String Result = "";

        if (imcResult < 18.5) {

            Result = "Baixo Peso";

        } else if (imcResult >= 18.5 && imcResult <= 24.9) {

            Result = "Peso Normal";

        } else if (imcResult >= 25 && imcResult <= 29.9) {

            Result = "Excesso de Peso";

        } else if (imcResult >= 30 && imcResult <= 34.9) {

            Result = "Obesidade de Classe 1";

        } else if (imcResult >= 35 && imcResult <= 39.9) {

            Result = "Obesidade de Classe 2";

        } else if (imcResult >= 40) {

            Result = "Obesidade de Classe 3";
        }

        IMC = imcResult;
        System.out.print("\n\nIMC         Resultado");
        System.out.printf("%n%.2f       %s%n", IMC,Result);
    }
}
