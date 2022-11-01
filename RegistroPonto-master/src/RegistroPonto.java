import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPonto {

    private Long idRegPonto;
    private Funcionario funcionario;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public RegistroPonto(long idRegPonto, Funcionario funcionario, LocalDate dataRegistro, LocalDateTime horaEntrada){
        this.idRegPonto = idRegPonto;
        this.funcionario = funcionario;
        this.dataRegistro = dataRegistro;
        this.horaEntrada = horaEntrada;
    }

    public RegistroPonto(long idRegPonto, Funcionario funcionario, LocalDate dataRegistro, LocalDateTime horaEntrada, LocalDateTime horaSaida) {
        this.idRegPonto = idRegPonto;
        this.funcionario = funcionario;
        this.dataRegistro = dataRegistro;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public Long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(Long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void apresentarRegistroPonto(){

        if (horaSaida == null){
            System.out.println("Funcionário: " + funcionario.getNome() + "\n" +
                    "Data de Registro: " + dataRegistro.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "\n" +
                    "Horário Entrada: " + horaEntrada.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "\n" +
                    "Horário Saída: Sem marcação" + "\n");

        }else {
            System.out.println("Funcionário: " + funcionario.getNome() + "\n" +
                    "Data de Registro: " + dataRegistro.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "\n" +
                    "Horário Entrada: " + horaEntrada.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "\n" +
                    "Horário Saída: " + horaSaida.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "\n");
        }
    }
}