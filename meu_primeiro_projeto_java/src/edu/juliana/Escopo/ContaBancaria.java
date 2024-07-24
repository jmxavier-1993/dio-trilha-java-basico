package edu.juliana.Escopo;

public class ContaBancaria {
    //variavel da classe contaBancaria

    double saldo= 10.0;

    public void sacar(double  valor){
     // variavel local do método

     double novoSaldo= saldo- valor;
    }

    public void imprimirSaldo(){
        // disponivel em toda classe
        System.out.println(saldo);
        // somente o metodo sacar conhece esta variavel
        //System.out.println(novoSaldo);

        
    }
}
