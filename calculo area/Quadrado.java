public class Quadrado extends Figura {
    private Integer lado;

    public Integer getLado() {
        return lado;
    }

    public void setLado(Integer lado) {
        this.lado = lado;
    }

    @Override
    public void area() {
        double area = lado * lado;

        System.out.println(" A area do quadrado é " + area  + " e sua cor é: " + super.getColor());


    }
}

