
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class CadastroExame {

    private final ArrayList<Exame> exames;

    public CadastroExame() {
        this.exames = new ArrayList<>();
    }

    public ArrayList<Exame> getExames() {
        return this.exames;
    }

    public int getSize() {
        return exames.size();
    }

    public Exame buscarExamePorID(int id) {
        for (Exame exame : exames) {
            if (exame.getId() == id) {
                return exame;
            }
        }
        return null;
    }

    public boolean adicionarExame(Exame exame) {
        if (buscarExamePorID(exame.getId()) != null) {
            return false;
        }
        exames.add(exame);
        return true;
    }

    public ArrayList<Exame> buscarExamesPorParteDoNome(String parteDoName) {
        ArrayList<Exame> encontrados = new ArrayList<>();
        for (Exame exame : exames) {
            if ((exame.getPaciente().getNome().contains(parteDoName)) || (exame.getMedico().getNome().contains(parteDoName))) {
                encontrados.add(exame);
            }
        }
        return encontrados;
    }

    public boolean marcarExameComoRealizado(int idExame, LocalDate data) {
        Exame exame = buscarExamePorID(idExame);
        if (exame != null) {
            if (data.isBefore(exame.getDataCriacao()) || data.isAfter(exame.getDataCriacao().plusDays(30))) {
                return false;
            }
            if (!exame.getConcluido()) {
                exame.setConcluido(true);
                exame.setDataConlusao(data);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Exame> buscarExamesPorPaciente(Usuario paciente) {
        ArrayList<Exame> encontrados = new ArrayList<>();
        for (Exame exame : exames) {
            if (exame.getPaciente().getId() == paciente.getId()) {
                encontrados.add(exame);
            }
        }
        Collections.sort(encontrados);
        return encontrados;
    }

    public ArrayList<Exame> buscarExamesPorTipoExame(TipoExame tipo) {
        ArrayList<Exame> encontrados = new ArrayList<>();
        for (Exame exame : exames) {
            if (exame.getTipo() == tipo) {
                encontrados.add(exame);
            }
        }
        Collections.sort(encontrados);
        return encontrados;
    }

    public ArrayList<Exame> buscarExamesPorUsuarioOrdenadosPorData(Usuario usuario) {
        ArrayList<Exame> encontrados = new ArrayList<>();
        for (Exame exame : exames) {
            if (exame.getPaciente().equals(usuario)) {
                encontrados.add(exame);
            }
        }
        Collections.sort(encontrados);
        return encontrados;
    }

    public double percentualExamesRealizados() {
        int contConcluidos = 0;
        for (Exame exame : exames) {
            if (exame.getConcluido()) {
                contConcluidos++;
            }
        }
        return (double) contConcluidos * 100 / exames.size();
    }
}
