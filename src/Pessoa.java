public abstract class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;

    public final void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }

    public String toString(){
        return " Pessoa{" + " nome=" + this.getNome() + ", idade=" + this.getIdade() + " sexo=" + this.getSexo();
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }

}

