package atividade1;

public class Principal {

    public static void main(String[] args) {
        FigurasGeometricas figura1 = new FigurasGeometricas(3.0f, "quadrado");
        FigurasGeometricas figura2 = new FigurasGeometricas();
        FigurasGeometricas figura3 = new FigurasGeometricas();

        System.out.println("********" + figura1.getNomeFigura() + "*********");
        System.out.println("Area do " + figura1.getNomeFigura() + " = "
                + figura1.calcularAreaFigura());
        System.out.println("Lado = " + figura1.getLado() + "\n");

        figura2.setBase(3.0f);
        figura2.setAltura(1.0f);
        figura2.setNomeFigura("triangulo");
        System.out.println("********" + figura2.getNomeFigura() + "*********");
        System.out.println("Area do " + figura2.getNomeFigura() + " = "
                + figura2.calcularAreaFigura());
        System.out.println("Base = " + figura2.getBase());
        System.out.println("Altura = " + figura2.getAltura() + "\n");

        figura3.setBaseMaior(4.0f);
        figura3.setBaseMenor(1.5f);
        figura3.setAltura(3.0f);
        figura3.setNomeFigura("trapézio");
        System.out.println("********" + figura3.getNomeFigura() + "*********");
        System.out.println("Area do " + figura3.getNomeFigura() + " = "
                + figura3.calcularAreaFigura());
        System.out.println("Base Maior = " + figura3.getBaseMaior());
        System.out.println("Base Menor = " + figura3.getBaseMenor());
        System.out.println("Altura = " + figura3.getAltura());
    }
}
