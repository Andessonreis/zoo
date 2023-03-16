public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 3, "auau");
        Animal gato = new Gato("Mimi", 2, "miau");
        Animal cavalo = new Cavalo("Galileu", 4, "hihi");
        System.out.println(cachorro.toString() + " ");
        cachorro.emitirSom();
        System.out.println(gato.toString() + " ");
        gato.emitirSom();
        System.out.println(cavalo.toString() + " ");
        cavalo.emitirSom();
        
      
    }
}
