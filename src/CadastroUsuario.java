
import java.util.ArrayList;

public class CadastroUsuario {

    private ArrayList<Usuario> usuarios;

    public CadastroUsuario() {
        this.usuarios = new ArrayList<>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public int getSize() {
        return this.usuarios.size();
    }

    public boolean adicionarUsuario(Usuario usuario) {
        if (usuario != null) {
            if (buscarUsuarioPorID(usuario.getId()) == null) {
                this.usuarios.add(usuario);
                return true;
            }
        }
        return false;
    }

    public Usuario buscarUsuarioPorID(int id) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorParteDoNome(String parteDoNome) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getNome().contains(parteDoNome)) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorIDeTipo(int id, TipoUsuario tipo) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getId() == id && usuario.getTipo() == tipo) {
                return usuario;
            }
        }
        return null;
    }

    public ArrayList<Usuario> getUsuariosPorTipo(TipoUsuario tipo) {
        ArrayList<Usuario> encontrados = new ArrayList<>();
        for (Usuario usuario : this.usuarios) {
            if (usuario.getTipo() == tipo) {
                encontrados.add(usuario);
            }
        }
        return encontrados;
    }

    public int contarUsuarios(TipoUsuario tipo) {
        int cont = 0;
        for (Usuario usuario : this.usuarios) {
            if (usuario.getTipo() == tipo) {
                cont++;
            }
        }
        return cont;
    }

    public double percentualUsuarios(TipoUsuario tipo) {
        return (double) contarUsuarios(tipo) * 100 / getSize();
    }

    @Override
    public String toString() {
        String str = "";
        if (!this.usuarios.isEmpty()) {
            for (Usuario usuario : this.usuarios) {
                str += usuario + "\n";
            }
        }
        return str;
    }
}
