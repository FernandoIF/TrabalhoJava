package atividade1;

public class FigurasGeometricas {
    
    private double lado;
    private double altura;
    private double base;
    private double baseMaior;
    private double baseMenor;
    private String nomeFigura;
    
    public FigurasGeometricas(){}
    
    public FigurasGeometricas(double lado, String nomeFigura){
        this.lado = lado;
        this.nomeFigura = nomeFigura;
    }
    
    public double calcularAreaFigura(){
       if(null == this.nomeFigura){
           return 0.0f;
       } else switch (this.nomeFigura) {
            case "quadrado":
                return this.lado * this.lado;
            case "triangulo":
                return (this.base * this.base) / 2;
            case "trapézio":
                return ((this.baseMenor + this.baseMaior) * this.altura) / 2;
            default:
                return 0.0f;
        }
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.calcularAreaFigura();
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
}
