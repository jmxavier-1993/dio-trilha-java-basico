package edu.juliana.Metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(13);
        System.out.println(smartTv.canal);

        System.out.println(smartTv.volume);

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);
        

        smartTv.ligar();
        System.out.println("Tv ligada:" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada:" + smartTv.ligada);
    }
    
}
