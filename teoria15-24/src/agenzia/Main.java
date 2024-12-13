package agenzia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       AgenziaImmobiliare agenziaImmobiliare=new AgenziaImmobiliare();

       Appartamenti a1=new Appartamenti(250,4,20);
       Appartamenti a2=new Appartamenti(20,1,5);
       Appartamenti a3=new Appartamenti(196,5,10);

       Ville v1=new Ville(500,15,true);
       Ville v2=new Ville(750,24,false);

       agenziaImmobiliare.addCasa(a1);
       agenziaImmobiliare.addCasa(a2);
       agenziaImmobiliare.addCasa(a3);
       agenziaImmobiliare.addCasa(v1);
       agenziaImmobiliare.addCasa(v2);

       System.out.println("Tutte le case con superficie > 125 : "+agenziaImmobiliare.mediaCosti(125));
       System.out.println(agenziaImmobiliare);

       System.out.println("Ordine in base a superfice\n");
       System.out.println(agenziaImmobiliare);
    }
}