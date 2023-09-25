import java.util.ArrayList;
import java.util.List;

public class Contato {

    public  String nome;
    public  String telefone;
    private  String email;

    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String toString(){
        return "Nome: " + nome + "," + " Telefone:  " + telefone + ","  + " Email: " + email;
    }

}
