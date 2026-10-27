public enum TypeProduit {
    Boisson(0.15),Patisserie(0.30);
    private final double tva;
    public double getTva(){
        return tva;
    }
    TypeProduit(double tva){
        this.tva=tva;
    }
}
