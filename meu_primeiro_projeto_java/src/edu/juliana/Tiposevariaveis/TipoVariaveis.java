package edu.juliana.Tiposevariaveis;

public class TipoVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinino = 2500;
        byte idade = 123;
        short ano = 2024;
        int cep= 53441625;// se começar com zero talvez precise que seja outro tipo
        long cpf= 12556378912L; // se começar com zero talvez precise que seja outro tipo   
        float pi =3.14F;

        short numeroCurto=1;
        int numeroNormal= numeroCurto;
        short numeroCurto2= (short) numeroNormal;

        final int NUMERO=5;
        // numero=10;
        System.out.println(NUMERO); // para tornar uma variavel de valor fixo "constante" é só usar o final e a variavel em caixa alta
        
        double soma=10.5+15.7;
        int subtração =113- 26;
        int multiplicação= 20 * 7 ;
        int divisão =15/3;
        int modulo= 18 % 3;
        double resultado1 = (10*7) + (20/4);

        System.out.println(resultado1);

        String nomeCompleto= "LINGUAGEM"+ "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?";

        concatenacao = 1+1+1 +"1";

        concatenacao= 1+"1"+1+1;

        concatenacao="1"+1+"1"+1;

        concatenacao ="1"+1+1+1;

        concatenacao="1"+(1+1+1);

        System.out.println(concatenacao);



        // unario

        int numero =5;

        // numero=-numero;

        // System.out.println(numero);

        // numero = numero * -1;

        // System.out.println(numero);

        // repetição

        // numero= numero +1;

        numero ++;
        System.out.println(numero);

        numero --;

        System.out.println(numero);

        boolean variavel= true;

        // System.out.println(!variavel);

        variavel= !variavel;

        System.out.println(variavel);

        //ternario

        int a ,b;
        a=5;
        b=6;

        if(a==b){
            System.out.println("verdadeiro");
        } else{
            System.out.println("falso");
        }
        

        String resultado2= a==b ?"verdadeiro" : "Falso";
        System.out.println(resultado2);

        int resultado3 = a==b ? 1 :0;
        System.out.println(resultado3);

        //relacionais

        String nomeum="JULIANA";
        String nomedois="juliana";
              

        int numero1=1;
        int numero2=2;

        System.out.println(nomeum==nomedois);

        System.out.println(nomeum.equals(nomedois));

        // if( nomeum == nomedois){
        //     System.out.println("verdadeiro");
        // } else{
        //     System.out.println("falso");
        // }

        boolean simNao= numero1== numero2;
        System.out.println("numeroum é igual a numerodois?"+ simNao);

        simNao= numero1!= numero2;

        System.out.println("numeroum é diferente de numerodois?"+ simNao);

        simNao= numero1> numero2;

        System.out.println("numeroum é maior que numerodois?"+ simNao);

        //lógicos

        boolean condicao1= true;
        boolean condicao2= false;

        if( condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras!");
        } 
            System.out.println("fim");
       

        if( condicao1 || condicao2){
            System.out.println("uma das duas condições é verdadeira!");
        } else{
            System.out.println("fim");

        }
          
        if( condicao1 && (7>4)){
            System.out.println("uma das duas condições é verdadeira!");
        } else{
            System.out.println("fim");

        }
        
    }
}
