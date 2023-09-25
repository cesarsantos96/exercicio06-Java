import java.util.List;

public class Main {
    public static void main(String[] args) {

        Agenda minhaAgenda = new Agenda();

        Contato contato1 = new Contato("Fernanda", "68 99992-0011", "fernanda@email.com");
        Contato contato2 = new Contato("Priscila", "62 98765-1245", "priscila@email.com");



        minhaAgenda.adicionarContato(contato1);
        minhaAgenda.adicionarContato(contato2);


        System.out.println("Lista de contatos: ");
        List<Contato> contatos = minhaAgenda.listarContatos();
        for (Contato contato : contatos){
            System.out.println(contato);
        }

        minhaAgenda.removerContato(contato1);

        System.out.println("\nLista de contatos após a remoção");
        contatos = minhaAgenda.listarContatos();
        for (Contato contato : contatos){
            System.out.println(contato);
        }
    }
}