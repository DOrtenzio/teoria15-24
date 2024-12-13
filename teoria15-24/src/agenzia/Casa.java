package agenzia;

public abstract class Casa implements Comparable<Casa> {
    private double superficie;
    private int numeroStanze;

    public Casa(double superficie, int numeroStanze) {
        this.superficie = superficie;
        this.numeroStanze = numeroStanze;
    }

    public double getSuperficie() { return superficie; }
    public void setSuperficie(double superficie) { this.superficie = superficie; }

    public int getNumeroStanze() { return numeroStanze; }
    public void setNumeroStanze(int numeroStanze) { this.numeroStanze = numeroStanze; }

    public abstract double costo();

    @Override
    public int compareTo(Casa c) {
        if(this.superficie<c.getSuperficie())
            return -1;
        else if(this.superficie==c.getSuperficie())
            return 0;
        else
            return 1;

    }
    @Override
    public String toString(){
        return "Sup: "+this.superficie+" N° stanze: "+this.numeroStanze;
    }
}
