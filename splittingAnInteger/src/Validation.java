import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Validation {
    private int numInt;
    Scanner scanner = new Scanner(System.in);

    public void entry(){
        System.out.print("\nDigite um número inteiro com 5 (cinco) dígitos: ");
        setNumInt(scanner.nextInt());
        if(getNumInt() < 10000){
            minNum();
        } else if (getNumInt() > 99999) {
            maxNum();
        } else {
            valid();
        }
    }

    public void minNum(){
        while (getNumInt() < 10000){
            System.out.printf("%nO número \"%d\" tem MENOS que 5 (cinco) dígitos...", getNumInt());
            entry();
        }
    }

    public void maxNum(){
        while (getNumInt() > 99999){
            System.out.printf("%nO número \"%d\" tem MAIS que 5 (cinco) dígitos...", getNumInt());
            entry();
        }
    }

    public void valid(){
        int fir =  getNumInt() / 10000;
        int sec = (getNumInt() / 1000) % 10;
        int thi = (getNumInt() / 100) % 10;
        int fou = (getNumInt() / 10) % 10;
        int fiv =  getNumInt() % 10;

        System.out.printf("%nOrdem de digitação");
        System.out.printf("%n1° - %d", fir);
        System.out.printf("%n2° - %d", sec);
        System.out.printf("%n3° - %d", thi);
        System.out.printf("%n4° - %d", fou);
        System.out.printf("%n5° - %d%n", fiv);


    }
}
