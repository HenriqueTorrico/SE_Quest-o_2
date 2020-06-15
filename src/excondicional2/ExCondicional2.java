package excondicional2;
    import java.util.Scanner;
public class ExCondicional2 {

    public static void main(String[] args) {
        double valor;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o segundo número");
        double num2 = entrada.nextDouble();
        valor = num1 + num2;
        if (valor <= 3)
            System.out.println("O valor é:" + valor);
        else
            System.out.println("Valor maior que 3, portanto inválido");
    }    
}
