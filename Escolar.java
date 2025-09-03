public class Escolar {
    private String nome;
    private String matricula;
    private double nota;

    public Escolar(String nome, String matricula, double nota) {
        this.nome = null;
        this.matricula = null;
        this.nota = 0;
        
    }
public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
public String getMatricula() {
        return matricula;
    }

public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void exibirInfo(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.nota);
    }
}
