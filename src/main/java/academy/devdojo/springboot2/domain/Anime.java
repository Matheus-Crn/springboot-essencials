package academy.devdojo.springboot2.domain;

public class Anime {
    private String name;

    public Anime(String name) {
        this.name = name;
    }
    public Anime(){
    }

    // necessario colocar o get e set para imprimir na web
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
