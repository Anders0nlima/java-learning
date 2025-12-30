package Step_2_Ecosystem_and_Persistence.Databases;

import Step_2_Ecosystem_and_Persistence.Databases.model.Autor;
import Step_2_Ecosystem_and_Persistence.Databases.model.Livro;
import Step_2_Ecosystem_and_Persistence.Databases.repository.BibliotecaRepository;

public class Main {
    public static void main(String[] args) {
        BibliotecaRepository repo = new BibliotecaRepository();

        //inserir dados
        //Autor tolkins = new Autor("J.R.R. Tolkien", "Britânico");
        //Autor novoAutor = new Autor("Stephen King", "Americano");
        //repo.salvarAutores(novoAutor);

        // Supondo que o ID gerado pelo banco para o Tolkien seja 1
        //Livro hobbit = new Livro("O Hobbit", 1937, 1);
        //repo.salvarLivro(hobbit);
        //Livro novoLivro = new Livro("O Iluminado", 1977, 5);
        //repo.salvarLivro(novoLivro);

        // 2. Lendo dados com JOIN
        //repo.listarLivrosComAutores();

        // 3. Atualizando
        //repo.atualizarTituloLivro(1, "O Hobbit: Edição Especial");

        //4. Deletando
        repo.deletarLivro(5);
    }
}
