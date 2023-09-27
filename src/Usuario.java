
public class Usuario {

    private int id;
    private String nome;
    private TipoUsuario tipo;

    public Usuario(int id, String nome, TipoUsuario tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public TipoUsuario getTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return this.id + "\t" + this.nome + "\t" + this.tipo;
    }
}
