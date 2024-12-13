package agenzia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AgenziaImmobiliare {
    private ArrayList<Casa> agenzia;

    public AgenziaImmobiliare(ArrayList<Casa> agenzia) {
        this.agenzia = agenzia;
    }
    public AgenziaImmobiliare() {
        this(new ArrayList<Casa>());
    }

    public ArrayList<Casa> getAgenzia() { return agenzia; }
    public void setAgenzia(ArrayList<Casa> agenzia) { this.agenzia = agenzia; }

    public double mediaCosti(double n){
        int conta=0;
        double supCostiTot=0.0;

        for (int i=0;i<agenzia.size();i++){
            if (agenzia.get(i).getSuperficie()>n){
                conta++;
                supCostiTot+=agenzia.get(i).getSuperficie();
            }
        }

        return supCostiTot/conta;
    }
    public void addCasa(Casa casa){
        agenzia.add(casa);
    }
    public String toString(){
        String s="Case: \n";
        for (int i=0;i<agenzia.size();i++){
            s=s+agenzia.get(i).toString()+"\n";
        }
        return s;
    }
    public void sortCase(){
        Collections.sort(agenzia);
    }
}
