import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Validation validation = new Validation();

        try {
            validation.entry();
        }catch (InputMismatchException e){
            System.out.println("Você digitou algo errado... Reinicie a aplicação e tente novamente.");
        }
    }
}