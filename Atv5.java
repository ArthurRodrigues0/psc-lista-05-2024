import java.util.Scanner;
public class Atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
     double soma = 0;
     double[] r = new double[12];
     int temp = 1;
    for(temp = 0;temp < 12; temp++){
        System.out.println("Digite a temperatura " + temp + " (entre 4 e 10): ");
            int n1 = scanner.nextInt();
        if(n1 < 4 || n1 > 10){
            System.out.println("ERRO! \nDigite um numero entre 4 ou 10.");
            temp--;
            continue;
        }
    r[temp] = n1;
    soma+=n1; }
    
    double media = soma/12;
    System.out.println("A temperatura media é " + media);
    scanner.close();
    
    }
}