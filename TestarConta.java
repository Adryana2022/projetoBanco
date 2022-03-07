//teste
package br.com.banco;
import java.util.Scanner;

public class TestarConta {
 
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        //criando estancia do objeto 
        Conta conta1= new Conta();
        
        conta1.numero=01;
        conta1.saldo=1500.50;
        conta1.titular="cleyton";
        
        System.out.println("ola"+conta1.MostrarDados());
        
        System.out.println("voce deseja retirar: ");
        double numero = leia.nextDouble();
        conta1.retirar(numero);
         
        
        System.out.println("seu saldo é: "+conta1.extrato());
    }
}
 
