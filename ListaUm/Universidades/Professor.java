package ListaUm.Universidades;

public class Professor extends Aluno{

    private String nome;
    private String turno;
    private int nota;


    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

          //////MÉTODO///////
    public double lancarNota(double notaAtual) {
        return notaAtual + nota;
    }
}
