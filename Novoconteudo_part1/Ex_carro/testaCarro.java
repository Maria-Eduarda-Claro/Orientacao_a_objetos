public class testaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setAno(2009);
        carro1.setCor("Preto");
        carro1.setModelo("Civic");
        carro1.setValor(43000.00);

        Carro carro2 = new Carro();
        carro2.setAno(2015);
        carro2.setCor("Cinza");
        carro2.setModelo("Corolla");
        carro2.setValor(70000.00);


        Carro carro3 = new Carro();
        carro3.setAno(2010);
        carro3.setCor("Branco");
        carro3.setModelo("Jetta");
        carro3.setValor(75000.00);

        Carro carro4 = new Carro();
        carro4.setAno(1999);
        carro4.setCor("Amarelo");
        carro4.setModelo("Fusca");
        carro4.setValor(20000.00);

        System.out.println("Carro 1 Ano: " + carro1.getAno());
        System.out.println("Carro 1 Cor: " + carro1.getCor());
        System.out.println("Carro 1 Modelo: " + carro1.getModelo());
        System.out.println("Carro 1 Valor: " + carro1.getValor());

        System.out.println("Carro 2 Ano: " + carro2.getAno());
        System.out.println("Carro 1 Cor: " + carro2.getCor());
        System.out.println("Carro 1 Modelo: " + carro2.getModelo());
        System.out.println("Carro 1 Valor: " + carro2.getValor());

        System.out.println("Carro 3 Ano: " + carro3.getAno());
        System.out.println("Carro 3 Cor: " + carro3.getCor());
        System.out.println("Carro 3 Modelo: " + carro3.getModelo());
        System.out.println("Carro 3 Valor: " + carro3.getValor());

        System.out.println("Carro 4 Ano: " + carro4.getAno());
        System.out.println("Carro 4 Cor: " + carro4.getCor());
        System.out.println("Carro 4 Modelo: " + carro4.getModelo());
        System.out.println("Carro 4 Valor: " + carro4.getValor());


    }
}
