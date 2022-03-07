
package br.com.banco;
public class Conta {
    
    //oque a conta tem(atributos)
    int numero;
    String titular;
    double saldo;
    double sacar;
    
    public String MostrarDados(){
        String dados="titular "+ titular +"\ndono da conta"+numero+"\nsaldo da conta"+saldo;
        return dados;
    }
    void  retirar(double valor){
        
        saldo=saldo-valor;
      
    }
    public double extrato(){
        double papel;
        papel=saldo;
        return papel;
    }
    
    
}
