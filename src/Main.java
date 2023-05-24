import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Main {

  public static Collection<Estudante> obterEntrada() {
    return Set.of(
        new Estudante("2001", "Maria", "Computação"),
        new Estudante("2002", "João", "Computação"),
        new Estudante("2003", "José", "Pedagogia"),
        new Estudante("2004", "Ana", "Computação"),
        new Estudante("2005", "Bernardo", "Engenharia"),
        new Estudante("2006", "Antônia", "Computação"));
  }
  public static void main(String[] args) {
    // usando Stream com forEach para retornar um valor fora de uma lista
    Collection<Estudante> entrada = obterEntrada();
    System.out.println("Estudantes de computação: ");
    entrada.stream()
        .filter(e -> "Computação".equals(e.getCurso()))
        .sorted(Comparator.comparing(Estudante::getNome))
        .map(Estudante::getNome)
        .forEach(System.out::println);

    List<String> matriculas = entrada.stream()
        .filter(e -> "Computação".equals(e.getCurso()))
        .sorted(Comparator.comparing((Estudante::getNome)))
        .map(Estudante::getMatricula)
        .toList();
    System.out.println("Matriculas: "+ matriculas);
  }
}