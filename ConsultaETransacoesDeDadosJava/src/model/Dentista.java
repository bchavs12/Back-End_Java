package model;

public class Dentista {

    private int Id;
    private String Nome;
    private String Sobrenome;
    private String Matricula;

    public Dentista(int id, String nome, String sobrenome, String matricula) {
        Id = id;
        Nome = nome;
        Sobrenome = sobrenome;
        Matricula = matricula;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        this.Matricula = matricula;
    }

}