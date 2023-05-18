package model;

public class Usuario {
    private String name;
    private String isPremium;
    private int ID;
    private String musica;

    public Usuario(String name, String isPremium, int ID, String musica) {
        this.name = name;
        this.isPremium = isPremium;
        this.ID = ID;
        this.musica = musica;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsPremium() {
        return isPremium;
    }

    public void setIsPremium(String isPremium) {
        this.isPremium = isPremium;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
}
