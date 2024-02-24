package ListaUm.Animal;

public class Programa {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();

        dog.setId(23);
        dog.setTipo("Selvagem");
        dog.setHabitat("Terrestre");
        dog.setNome("Caramelo");
        dog.setRaca("Vira-Lata");
        dog.setIdade(4);

        System.out.println(dog.getNome());
        System.out.println(dog.getIdade());
        System.out.println(dog.getRaca());
        System.out.println(dog.getTipo());
        System.out.println(dog.getHabitat());
        System.out.println("ID do animal: " + dog.getId());
    }
    
}
