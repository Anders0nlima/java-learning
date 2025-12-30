package Step_2_Ecosystem_and_Persistence.Databases.repository;

import Step_2_Ecosystem_and_Persistence.Databases.config.DatabaseConfig;
import Step_2_Ecosystem_and_Persistence.Databases.model.Autor;
import Step_2_Ecosystem_and_Persistence.Databases.model.Livro;

import java.sql.*;

public class BibliotecaRepository {
    // CREATE: Salvar Autor
    public void salvarAutores(Autor autor){
        String sql = "INSERT INTO autores (nome, nacionalidade) VALUES (?, ?)";

        try(Connection conn = DatabaseConfig.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1,autor.getNome());
            pstmt.setString(2,autor.getNacionalidade());
            pstmt.executeUpdate();
            System.out.println("Autor " + autor.getNome() + " salvo com sucesso");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    // CREATE: Salvar Livro
    public void salvarLivro(Livro livro){
        String sql = "INSERT INTO autores (nome, nacionalidade) VALUES (?, ?)";
        try(Connection conn = DatabaseConfig.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,livro.getTitulo());
            pstmt.setInt(2,livro.getAno());
            pstmt.setInt(3, livro.getAutorId());
            pstmt.executeUpdate();
            System.out.println("Autor " + livro.getTitulo() + " salvo com sucesso");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    // READ + JOIN: Listar Livros com Nomes dos Autores
    public void listarLivrosComAutores(){
        String sql = "SELECT l.titulo, l.ano_publicacao, a.nome FROM livros l " +
                "INNER JOIN autores a ON l.autor_id = a.id";

        try (Connection conn = DatabaseConfig.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("--- RELATÓRIO DE LIVROS ---");
            while (rs.next()) {
                System.out.printf("Livro: %s (%d) | Autor: %s\n",
                        rs.getString("titulo"), rs.getInt("ano_publicacao"), rs.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE: Atualizar título
    public void atualizarTituloLivro(int id, String novoTitulo) {
        String sql = "UPDATE livros SET titulo = ? WHERE id = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, novoTitulo);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Livro ID " + id + " atualizado para: " + novoTitulo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE: Remover livro
    public void deletarLivro(int id) {
        String sql = "DELETE FROM livros WHERE id = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Livro ID " + id + " deletado.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
