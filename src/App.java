public class App {
    // Aula do professor Gustavo Guanabara (cursoemvideo);
    public static void main(String[] args) throws Exception {
        /*Pessoa p1 = new Pessoa(); // Classe Abstrata*/
        Visitante v1 = new Visitante(); // Herança de implementação
        Aluno a1 = new Aluno(); // Herança de Diferença
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();

        v1.setIdade(22);
        v1.setNome("Biribinha");
        v1.setSexo("F");
        v1.fazerAniv();
        System.out.println(v1.toString());
        
        a1.setNome("Estudio");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.setMatricula(1111);
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        b1.setNome("Benedito");
        b1.setIdade(30);
        b1.pagarMensalidade();

        t1.setRegistroPro(1232);
        t1.setNome("Trabando");
        t1.setSexo("M");
        t1.pagarMensalidade();

    }
}
