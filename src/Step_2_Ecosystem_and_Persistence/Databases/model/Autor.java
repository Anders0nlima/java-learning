package Step_2_Ecosystem_and_Persistence.Databases.model;

public class Autor {
    private int id; //serial
    private String nome;
    private String nacionalidade;

    public Autor(int id, String nome, String nacionalidade){
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    //cadastro sem id
    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


}
