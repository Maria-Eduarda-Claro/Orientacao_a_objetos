public class Circulo extends Figura{
    private Integer raio;

    public Integer getRaio() {
        return raio;
    }

    public void setRaio(Integer raio) {
        this.raio = raio;
    }

    @Override
    public void area() {
        double area = raio * raio * (3.14);
        System.out.println(" A area do circulo é " + area + " e sua cor e: " + super.getColor());

    }
}
