package ListaUm.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Henrique");
        pessoa.setIdade(19);
        pessoa.setAltura(1.69);
        pessoa.setPeso(71.2);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade() + " anos");
        System.out.println(pessoa.getPeso() + "kg");
        System.out.println(pessoa.getAltura() + "cm");
    }
}
