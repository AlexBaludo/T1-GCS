
import java.time.LocalDate;

public class Exame implements Comparable<Exame> {

    private int id;
    private LocalDate dataCriacao;
    private Usuario medico;
    private Usuario paciente;
    private TipoExame tipo;
    private Boolean concluido;
    private LocalDate dataConlusao;

    public Exame(int id, LocalDate dataCriacao, Usuario medico, Usuario paciente, TipoExame tipo) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.medico = medico;
        this.paciente = paciente;
        this.tipo = tipo;
        this.concluido = false;
        this.dataConlusao = null;
    }

    public int getId() {
        return this.id;
    }

    public LocalDate getDataCriacao() {
        return this.dataCriacao;
    }

    public Usuario getMedico() {
        return this.medico;
    }

    public Usuario getPaciente() {
        return this.paciente;
    }

    public TipoExame getTipo() {
        return this.tipo;
    }

    public Boolean getConcluido() {
        return this.concluido;
    }

    public LocalDate getDataConlusao() {
        return this.dataConlusao;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }

    public void setDataConlusao(LocalDate dataConlusao) {
        this.dataConlusao = dataConlusao;
    }

    @Override
    public int compareTo(Exame o) {
        if (this.dataCriacao.isBefore(o.dataCriacao)) {
            return -1;
        } else if (this.dataCriacao.isAfter(o.dataCriacao)) {
            return 1;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return this.id + "\t" + this.dataCriacao + "\t" + this.medico + "\t" + this.paciente + "\t" + this.tipo + "\t" + this.concluido + "\t" + (this.dataConlusao == null ? "-" : this.dataConlusao);
    }
}
