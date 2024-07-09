package edu.juliana.Metodos;


public class SmartTv {
    boolean ligada =false;
    int canal= 1;
    int volume= 22;

    public  void aumentarCanal(){
        canal = canal +1;
        
        
    }

    public  void diminuirCanal(){
        canal = canal -1;
        
        
    }

    public  void mudarCanal(int novoCanal){
        canal = novoCanal;
        
        
    }

    public  void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo volume em:"+ volume);
        
    }

    public  void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando volume em:"+ volume);
    }

    public  void ligar(){
        ligada= true;
    }

    public  void desligar(){
        ligada= false;
    }
    }