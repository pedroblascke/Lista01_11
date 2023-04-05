import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // Questão 11

    //Entrada
    Double primeiro, segundo, terceiro;
    Double calculo1, calculo2, calculo3;
    Scanner teclado;

    System.out.println("Escreva dois números inteiros e um número real ");
    teclado = new Scanner(System.in);
    primeiro = teclado.nextDouble();
    segundo = teclado.nextDouble();
    terceiro = teclado.nextDouble();
    teclado.close();

    //Processamento
    calculo1 = (2 * primeiro) * (segundo / 2);
    calculo2 = (3 * primeiro) + (terceiro);
    calculo3 = (terceiro * terceiro * terceiro);

    //Saída
    System.out.println("O produto do dobro do primeiro número digitado com a metade do segundo equivale a: " + calculo1);
    System.out.println(" A soma do triplo do primeiro número digitado com o terceiro: " + calculo2);
    System.out.println(" O terceiro número digitado elevado ao cubo: " + calculo3);

    
    











    }
}
