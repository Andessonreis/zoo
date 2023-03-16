public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String som;

    public Animal(String nome, int idade, String som) {
        this.setIdade(idade);
        this.setNome(nome);
        this.setSom(som);
    }

    public abstract void emitirSom();

public String toString() {
    return "Nome: " + getNome() + ", Idade: " + getIdade();
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }
}