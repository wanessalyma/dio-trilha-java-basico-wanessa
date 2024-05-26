package edu.wanessa.dominandoLinguagemJava.sintaxeJava;

public class Usuario {
   
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        System.out.println ("Como está minha TV:" + (smartTv.ligada == true? "Tv Ligada":"Tv Desligada"));
        System.out.println ("Canal atual: " + smartTv.canal);
        System.out.println ("Volume atual: " + smartTv.volume);

        System.out.println ("Ligar Minha TV:");
        smartTv.ligada = true;
        System.out.println (smartTv.ligada == true? "Tv Ligada":"Tv Desligada");

        System.out.println ("Passando para o canal 3:");
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println ("Canal: " + smartTv.canal);

        System.out.println ("Voltando para o canal 2:");
        smartTv.diminuirCanal();
        System.out.println ("Canal: " + smartTv.canal);

        System.out.println ("Aumentando volume para 28:");
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println ("Volume: " + smartTv.volume);

        System.out.println ("Diminuir volume para 27:");
        smartTv.diminuirVolume();;
        System.out.println ("Volume: " + smartTv.volume);

        System.out.println ("Trocar canal para 30:");
        smartTv.mudarCanal(30);
        System.out.println ("Canal: " + smartTv.canal);

        System.out.println ("Desligar Minha TV:");
        smartTv.ligada = false;
        System.out.println (smartTv.ligada == true? "Tv Ligada":"Tv Desligada");
    }

}
