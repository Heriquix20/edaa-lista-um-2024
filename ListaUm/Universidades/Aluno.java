package ListaUm.Universidades;

public class Aluno {
    
    private String nome;
    private double id;
    private double notaAtual;
    private int presenca;


    public double getNotaAtual() {
        return notaAtual;
    }
    public void setNotaAtual(double notaAtual) {
        this.notaAtual = notaAtual;
    }


    public int getPresenca() {
        return presenca;
    }
    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getId() {
        return id;
    }
    public void setId(double id) {
        this.id = id;
    }

        //////MÉTODO///////
    public int irNaAula() {
    return presenca ++;
    }
}
