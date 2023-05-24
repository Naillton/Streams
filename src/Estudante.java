public class Estudante {

  private String matricula;
  private String nome;
  private String curso;

  public Estudante(String matricula, String nome, String curso) {
    this.matricula = matricula;
    this.nome = nome;
    this.curso = curso;
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

  public void setMatricula() {
    this.matricula = matricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso() {
    this.curso = curso;
  }
}
