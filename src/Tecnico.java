public class Tecnico extends Aluno{
    private int registroPro;

    public void praticar(){
        System.out.println(this.getNome() + " está praticando");
    }
    public int getRegistroPro(){
        return this.registroPro;
    }
    public void setRegistroPro(int rp){
        this.registroPro = rp;
    }
}
