public class Bolsista extends Aluno{
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de bolsista");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagando mensalidade.");
    }
    public float getBolsa(){
        return this.bolsa;
    }
    public void setBolsa(int b){
        this.bolsa = b;
    }
}
