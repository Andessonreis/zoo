public class Cavalo extends Animal {
    
    public Cavalo(String nome, int idade, String som) {
        super(nome, idade, som);
    }

    @Override
    public void emitirSom() {
        System.out.println("hihihi");
       
    }
}