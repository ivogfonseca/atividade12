package Question01;

public class Main {
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(1.0);
        Circulo circulo2 = new Circulo(2.0);
        Circulo circulo3 = new Circulo(3.0);
        Circulo circulo4 = new Circulo(4.0);
        Circulo circulo5 = new Circulo(5.0);

        java.util.List<Circulo> circulos = new java.util.ArrayList<>();
        circulos.add(circulo1);
        circulos.add(circulo2);
        circulos.add(circulo3);
        circulos.add(circulo4);
        circulos.add(circulo5);

        for (Circulo circulo : circulos) {
            System.out.println("Raio: " + circulo.getRaio() + " - Área: " + circulo.calcularArea());
        }
    }
}
