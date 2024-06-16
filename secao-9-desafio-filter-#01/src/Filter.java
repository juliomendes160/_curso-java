import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Juliermes", 10, false);
		Aluno aluno2 = new Aluno("Carolynne", 10, true);
		
		List<Aluno> alunos = Arrays.asList(aluno1, aluno2);
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
		Predicate<Aluno> comportamento = aluno -> aluno.comportamento;
		Function<Aluno, String> exibir = aluno -> aluno.nome;
		
		alunos.stream()
			.filter(aprovado)
			.filter(comportamento)
			.map(exibir)
			.forEach(System.out::println);
	}
}
