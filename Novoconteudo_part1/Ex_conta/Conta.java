public class Conta {
    private double saldo;
    private  double limite;
   private int numero;

   public void setSaldo(double saldo){
       this.saldo = saldo;
   }

   public  double getSaldo(){
       return this.saldo;
   }

   public void setLimite(double limite){
       this.limite = limite;
   }

   public Double getLimite(){
       return this.limite;
   }

   public void setNumero(int numero){
       this.numero = numero;
   }

   public int getNumero(){
       return this.numero;
   }

    public void adicionarSaldo(double saldoNovo){
        saldo = saldo + saldoNovo;

    }
    public void saque(double valor){
        this.saldo = saldo - valor;
    }
}
