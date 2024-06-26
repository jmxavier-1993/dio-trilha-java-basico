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
        
    }
}
