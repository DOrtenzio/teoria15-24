package agenzia;

public class Appartamenti extends Casa{
    private int codiceEnergetico;

    public Appartamenti(double superficie, int numeroStanze, int codiceEnergetico) {
        super(superficie, numeroStanze);
        this.codiceEnergetico=codiceEnergetico;
    }

    public int getCodiceEnergetico() { return codiceEnergetico; }
    public void setCodiceEnergetico(int codiceEnergetico) { this.codiceEnergetico = codiceEnergetico; }

    @Override
    public double costo() {
        return 1500*super.getSuperficie()+this.codiceEnergetico*super.getNumeroStanze();
    }
    @Override
    public String toString(){
        return super.toString()+" Codice Energetico: "+this.codiceEnergetico;
    }
}
