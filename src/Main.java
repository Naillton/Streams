import java.util.ArrayList;
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

    // criando ArrayList de pessoas e usando a stream para interrar sobre o array e retornar quantas pessoas
    // tem sem repeticoes
    // Para definir diretamente uma lista usamos o List<String> persons = List.of("nam1", "naam2")
    ArrayList<String> persons = new ArrayList<>();
    persons.add("Maria");
    persons.add("Maria");
    persons.add("Fulano");
    persons.add("Zezin");
    persons.add("Marilia");
    persons.add("Marilia");

    Long result = persons.stream()
        .distinct()
        .count();
    System.out.println(result);
  }
}