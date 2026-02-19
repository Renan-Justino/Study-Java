public class App {

    // Instanciando a classe Usuario para acessar seus atributos e métodos.
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
            "Renan Justino",
            "senha123",
            "Renan@itlean.com"
        ); 
        // Precisa instanciar a classe Usuario para acessar
        
        System.out.println(usuario); // Imprimindo o objeto usuario, isso irá imprimir a referência do objeto na memória.
        System.out.println(usuario.username); // Acessando o atributo username da classe Usuario.
        System.out.println(usuario.password); // Acessando o atributo password da classe Usuario.
        System.out.println(usuario.email); // Acessando o atributo email da classe Usuario.
    }
}
