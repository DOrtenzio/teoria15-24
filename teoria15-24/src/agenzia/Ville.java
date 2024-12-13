package agenzia;

public class Ville extends Casa{
    private boolean isPresentePiscina;

    public Ville(double superficie, int numeroStanze, boolean isPresentePiscina) {
        super(superficie, numeroStanze);
        this.isPresentePiscina=isPresentePiscina;
    }

    public boolean isPresentePiscina() { return isPresentePiscina; }
    public void setPresentePiscina(boolean presentePiscina) { isPresentePiscina = presentePiscina; }

    @Override
    public double costo() {
        double costo=2000*super.getSuperficie();
        if (isPresentePiscina)
             costo+=20000;
        if (super.getNumeroStanze()>=10)
            costo+=10000;
        return costo;
    }
    @Override
    public String toString(){
        return super.toString()+" Piscina: "+this.isPresentePiscina;
    }
}
