package Step_2_Ecosystem_and_Persistence.Databases.model;

public class Livro {
    private int id; //serial
    private String titulo;
    private int ano;
    private int autorId;

    public Livro(int id, String titulo, int ano, int autorId){
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.autorId = autorId;
    }

    //sem id
    public Livro(String titulo, int ano, int autorId) {
        this.titulo = titulo;
        this.ano = ano;
        this.autorId = autorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
