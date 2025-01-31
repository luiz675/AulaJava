import java.util.ArrayList;

public class Profissional {
    public  String nome;
    public String email;
    public String telefone;

    public ArrayList<Projetos>projetos;

    public Profissional(String nome, String email, String telefone){
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.projetos = new ArrayList<Projetos>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Projetos> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Projetos> projetos) {
        this.projetos = projetos;
    }

    @Override
    public String toString() {
        return "Profissional{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", projetos=" + projetos.toString() +
                '}';
    }
}
