
public class Usuario {

    // Aqui criei uma classe com alguns atributos publicos.
    public String username;
    public String password;
    public String email;
    public boolean ativo;

    // Aqui criei um construtor vazio para a classe Usuario, ele é utilizado para criar objetos da classe Usuario sem inicializar seus atributos.
    public Usuario() {
        
    }

    // Aqui criei um construtor para a classe Usuario, ele é utilizado para criar objetos da classe Usuario e inicializar seus atributos.
    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Aqui irei criar metodos para acessar e modificar os atributos da classe Usuario.
    public boolean isAtivo() {
        return ativo;
    }
}